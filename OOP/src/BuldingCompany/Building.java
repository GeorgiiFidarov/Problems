package BuldingCompany;

public abstract class Building {
    private String name;
    private String address;
    private int year;//год основания
    private String architectorName;
    private boolean culturalMonument;
    private static int count;



    public int numberOfFloors;
    public Building(){
        count++;
        this.address = "Default Address";//default
        this.year = 1990; //default
        this.culturalMonument = false;//default
        this.architectorName = "Fidarov Georgii";//as default
        this.name = "Default name";
        this.numberOfFloors = 0;
    }
    public Building(String name,int numberOfFloors) {
        count++;
        this.address = "Default Address";//default
        this.year = 1990; //default
        this.culturalMonument = false;//default
        this.architectorName = "Fidarov Georgii";//as default
        this.name = name;
        this.numberOfFloors = numberOfFloors;
    }
    public Building(String name, String address,int numberOfFloors) {
        count++;
        this.year = 1990; //default
        this.culturalMonument = false;//default
        this.architectorName = "Fidarov Georgii";//as default
        this.name = name;
        this.address = address;
        this.numberOfFloors = numberOfFloors;
    }

    public Building(String name, String address, int year,int numberOfFloors) {
        count++;
        this.culturalMonument = false;//default
        this.architectorName = "Fidarov Georgii";//as default
        this.name = name;
        this.address = address;
        this.year = year;
        this.numberOfFloors = numberOfFloors;
    }

    public Building(String name, String address, int year, String architectorName,int numberOfFloors) {
        count++;
        this.culturalMonument = false;//false as default
        this.name = name;
        this.address = address;
        this.year = year;
        this.architectorName = architectorName;
        this.numberOfFloors = numberOfFloors;
    }
    public Building(String name, String address, int year, String architectorName, boolean cultiralMonument,int numberOfFloors) {
        count++;
        this.name = name;
        this.address = address;
        this.year = year;
        this.architectorName = architectorName;
        this.culturalMonument = cultiralMonument;
        this.numberOfFloors = numberOfFloors;
    }

    //---------getters/setters-------//
    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
    public static void setCount(int count) {
        Building.count = count;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }
    public static int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getArchitectorName() {
        return architectorName;
    }

    public void setArchitectorName(String architectorName) {
        this.architectorName = architectorName;
    }

    public boolean isCulturalMonument() {
        return culturalMonument;
    }

    public void setCulturalMonument(boolean culturalMonument) {
        this.culturalMonument = culturalMonument;
    }

    @Override
    public String toString() {
        return "Имя здания = " + name + '\n' +
                "Адрес расположения = " + address + '\n' +
                "Год основния = " + year + '\n' +
                "Имя архитектора = " + architectorName + '\n' +
                "Является культурным момнументом = " + (culturalMonument?"Да":"Нет");
    }
}
