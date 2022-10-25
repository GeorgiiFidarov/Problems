import java.util.Arrays;
import java.util.Calendar;
import java.util.Objects;

public class Main {

}
class Bugatti {
    private String color = "BLACK";
    private int year = 2020;
    private String body = "Coupe";

    public Bugatti() {

    }
    public void setBody(String body) {
        this.body = body;
    }
    public String getBody() {
        return body;
    }
}
class Programmer {
    private int salary = 1000;
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        if (this.salary<salary)
            this.salary = salary;
    }


}
class iphone{
    private String model;
    private String color;
    private int price;

    public iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof iphone)) return false;
        if (this.model ==null) return false;
        iphone iphone = (iphone) o;
        return price == iphone.price &&
                Objects.equals(model, iphone.model) &&
                Objects.equals(color, iphone.color);
    }
}
class Memory {
    /*
    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

     */

    public static void executeDefragmentation(String[] array) {
        int length = array.length;//
        String[]b = new String[length];//
        int counter = 0;
        for (int i = 0; i< b.length;i++){
            if (array[i]!=null) {
                array[counter++] = array[i];
            }
        }
        Arrays.fill(array, counter, array.length, null);
    }
}
class Market {
    private static boolean hasEggs = true;
    /*
    public static void main(String[] args) {
        boolean hasEggs = true;
        makePurchases(hasEggs);
    }

     */

    public static void makePurchases(boolean hasEggs) {
        if (!hasEggs) {
            System.out.println("Купил 10 батонов");
        } else
            System.out.println("Купил 1 батон");
        }
}
class Hedgehog {

    public void eat(Apple apple) {
        System.out.println("Яблоко было съедено!");
    }
    /*
    public static void main(String[] args) {
        Apple apple = new Apple();
        Hedgehog hedgehog = new Hedgehog();
        hedgehog.eat(apple);
    }
     */

    public static class Apple {
    }
}
class Solution {
    public static void showWeather(City city) {
        System.out.println("В городе "+city.getName()
                +" сегодня температура воздуха "
                +city.getTemperature());
    }
    /*
    public static void main(String[] args) {
        showWeather(new City("Дубай",40));
    }
     */
}
class City {
    private String name;
    private int temperature;
    public City(String name, int temperature) {
        this.name = name;
        this.temperature = temperature;
    }
    public String getName() {
        return name;
    }
    public int getTemperature() {
        return temperature;
    }
}
class Earth {
    /*
    public static void main(String[] args) {
        Africa africa = new Africa(100);
        Antarctica antarctica = new Antarctica(200);
        Australia australia = new Australia(300);
        Eurasia eurasia = new Eurasia(400);
        NorthAmerica northAmerica = new NorthAmerica(10);
        SouthAmerica southAmerica = new SouthAmerica(1000);
    }
     */
}
class Africa{
    private final int area;
    public Africa(int area) {
        this.area = area;
    }
}
class Antarctica{
    private final int area;
    public Antarctica(int area) {
        this.area = area;
    }
}
class Australia{
    private final int area;
    public Australia(int area) {
        this.area = area;
    }
}
class Eurasia{
    private final int area;
    public Eurasia(int area) {
        this.area = area;
    }
}
class NorthAmerica{
    private final int area;
    public NorthAmerica(int area) {
        this.area = area;
    }
}
class SouthAmerica{
    private final int area;
    public SouthAmerica(int area) {
        this.area = area;
    }
}
class Solution1 {

    private int currentYear;

    public Solution1() {
        this.currentYear = Calendar.getInstance().get(Calendar.YEAR);
    }

    public int getCurrentYear() {
        return currentYear;
    }
    /*
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.getCurrentYear());
    }
     */
}
class Cat{
    String name;
    int age;
    static int count = 0;//переменная класса задаётся в классе static

    public Cat(String name, int age){
        count++;
        this.age = age;
        this.name = name+" "+count +" "+" "+age;


    }

    public static void main(String[] args) {
        Cat streetCat1 = new Cat("Vasia",4);
        Cat streetCat2 = new Cat("Igor",3);
        System.out.println(streetCat1.name);
        System.out.println(streetCat2.name);
    }
}































