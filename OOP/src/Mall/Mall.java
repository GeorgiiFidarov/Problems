package Mall;

import java.util.Date;

public class Mall {
    protected final String address;
    protected final String mallName;
    protected final String workingTime;
    //not so important
    protected final int amountOfFloors;
    protected static int count = 0;

    abstract static class Builder{
        private final String address;
        private final String mallName;
        private final String workingTime;
        //non valuable
        private int amountOfFloors = 1;

        public Builder(String address, String mallName, String workingTime){
            count++;
            this.address = address;
            this.mallName = mallName;
            this.workingTime = workingTime;
        }
        public Builder amountOfFloors(int var){
            amountOfFloors = var;
            return this;
        }
        abstract Mall build();
    }
    protected Mall(Builder builder){
        address = builder.address;
        mallName = builder.mallName;
        workingTime = builder.workingTime;
        amountOfFloors = builder.amountOfFloors;
    }
    //-----------------getters-------------//

    public static int getCount() {
        return count;
    }

    public String getAddress() {
        return address;
    }

    public String getMallName() {
        return mallName;
    }

    public String getWorkingTime() {
        return workingTime;
    }

    public int getAmountOfFloors() {
        return amountOfFloors;
    }
    @Override
    public String toString() {
        return getClass()+"{" +
                "Адрес ТЦ = " + address + '\n' +
                "Название ТЦ = " + mallName + '\n' +
                "Время работы ТЦ = " + workingTime + '\n'+
                "Количество этажей = " + amountOfFloors +'}';
    }
}
