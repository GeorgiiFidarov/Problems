import java.util.Arrays;
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

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

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


























