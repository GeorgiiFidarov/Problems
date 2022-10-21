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
class Programmer{
    private int salary = 1000;
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        if (this.salary<salary)
            this.salary = salary;
    }

    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        programmer.setSalary(10);
        System.out.println(programmer.salary);
    }
}

