package Zoopark;

public class Bird extends Animal{
    private String area = "";
    private boolean winterFly;
    private String sound = "Chik-Chirik";
    private int number;
    private final static String description = "The Bird class is a subclass of the Animal class.";
    public Bird() {
        number = getCounter();
    }
    public Bird(String type, String name) {
        super(type, name);
        number = getCounter();
    }
    public Bird(String type, int age) {
        super(type, age);
        number = getCounter();
    }
    public Bird(String type, String name, int age) {
        super(type, name, age);
        number = getCounter();
    }
    public Bird(String type, String name, int age, double weight) {
        super(type, name, age, weight);
        number = getCounter();
    }
    public Bird(String type, String name, int age, double weight, String area, boolean winterFly) {
        super(type, name, age, weight);
        this.area = area;
        this.winterFly = winterFly;
        number = getCounter();
    }
    public Bird(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
        super(type, name, age, weight, isFly, isWalk, isSwim);
        number = getCounter();
    }
    public Bird(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim, String area, boolean winterFly) {
        super(type, name, age, weight, isFly, isWalk, isSwim);
        this.area = area;
        this.winterFly = winterFly;
        number = getCounter();
    }
    public String getArea() {return area;}
    public void setArea(String area) {this.area = area;}
    public boolean isWinterFly() {return winterFly;}
    public void setWinterFly(boolean winterFly) {this.winterFly = winterFly;}
    public String getSound() {return sound;}
    public void setSound(String sound) {this.sound = sound;}
    public int getNumber() {return number;}
    public static void getClassDescription() {System.out.println(description);}
    @Override
    public void display() {
        System.out.printf("" +
                "Type: %s, " +
                "Name: %s, " +
                "Age: %d, " +
                "Weight: %.1f, %s" +
                "Does it fly: %s, " +
                "Does it fly south for the winter: %s, " +
                "Does it walk: %s, " +
                "Does it swim: %s%n", getType(), getName(), getAge(), getWeight(), area.isEmpty() ? "" : "Area: " + area + ", ", isFly() ? "Yes" : "No", winterFly ? "Yes" : "No", isWalk() ? "Yes" : "No", isSwim() ? "Yes" : "No");
    }
    @Override
    public String toString() {
        return String.format("[%d] " +
                "Type: %s, " +
                "Name: %s, " +
                "Age: %d, " +
                "Weight: %.1f, " +
                "Does it fly: %s, " +
                "Does it walk: %s," +
                "Does it swim: %s", number, getType(), getName(), getAge(), getWeight(), isFly() ? "Yes" : "No", isWalk() ? "Yes" : "No", isSwim() ? "Yes" : "No");
    }
}
