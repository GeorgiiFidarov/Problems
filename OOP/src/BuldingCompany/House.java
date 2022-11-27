package BuldingCompany;

public class House extends Building implements LivingHouse{
    private int numberOfPeople;
    public String religion;
    private int number;



    public double salary;
    public double tax;

    public House(String name, String address, int year, String architectorName, boolean culturalMonument,int numberOfFloors,int numberOfPeople,String religion) {
        super(name, address, year, architectorName, culturalMonument,numberOfFloors);
        this.religion = religion;
        this.numberOfPeople = numberOfPeople;
        number = getCount();
    }
    public House(){
        super();
        this.numberOfPeople = 0;
        this.religion = "Atheist";
        number = getCount();
    }
    //----Interface Implementation Methods----//
    @Override
    public void heat() {
        if (numberOfPeople>2)
            System.out.println("Heated");
        else
            System.out.println("Not Heated");
    }

    @Override
    public void elevator() {
        if (numberOfFloors > 5)
            System.out.println("Elevator in this house");
        else
            System.out.println("Go home on your own");
    }

    @Override
    public void produceTax() {
        tax = salary-(salary*0.3);
        System.out.println("Amount of taxes: "+tax);
    }
    //-------------getters and setters-------------//
    public int getNumber() {
        return number;
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    @Override
    public String toString() {
        return getClass()+"{" +
                "Number of People='" + getNumberOfPeople() + '\'' +
                "Religion = " + getReligion() +
                '}'+'\n'+
                "Building info\n"+"Address: "+getAddress()+'\n'
                +"Name: "+getName()+'\n'
                +"Established at: "+getYear()+'\n'
                +"Arhitector's Name: "+getArchitectorName()+'\n'
                +"Cultural Monument: "+(isCulturalMonument()?"Да":"Нет")+'\n'
                +"The Bulding number: " + getNumber()+'\n'
                +"Amount of floors: " + getNumberOfFloors()+"\n-----------------";
    }
}
