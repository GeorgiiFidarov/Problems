package BuldingCompany;

public class Univercity extends Building{
    //main variables
    private final double yearCost;
    private final int numberOfStudents;
    private final int amountOfFacilities;
    //alternative
    private final String univercityBranch;
    private final String country;
    public static class Builder{
        //valuable
        private final double yearCost;
        private final int numberOfStudents;
        private final int amountOfFacilities;
        //non valuable
        private String univercityBranch = "Science";
        private String country = "Default";
        public Builder(int yearCost, int numberOfStudents, int amountOfFacilities){
            this.yearCost = yearCost;
            this.numberOfStudents = numberOfStudents;
            this.amountOfFacilities = amountOfFacilities;
        }
        public Builder univercityBranch (String val){
            univercityBranch = val;
            return this;
        }
        public Builder country(String val){
            country = val;
            return this;
        }
        public Univercity build(){
            return new Univercity(this);
        }
    }
    private Univercity(Builder builder){
        yearCost = builder.yearCost;
        numberOfStudents = builder.numberOfStudents;
        amountOfFacilities = builder.amountOfFacilities;
        univercityBranch = builder.univercityBranch;
        country = builder.country;
    }
}
