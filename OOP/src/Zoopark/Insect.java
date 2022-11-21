package Zoopark;

public class Insect extends Animal{
    private int wingCount = 0;
    private boolean likeJesus;
    private int number;
    private final static String description = "The Insect class is a subclass of the Animal class.";
    public Insect() {
        number = getCounter();
    }
    public Insect(String type, String name) {
        super(type, name);
        number = getCounter();
    }
    public Insect(String type, int age) {
        super(type, age);
        number = getCounter();
    }
    public Insect(String type, String name, int age) {
        super(type, name, age);
        number = getCounter();
    }
    public Insect(String type, String name, int age, double weight) {
        super(type, name, age, weight);
        number = getCounter();
    }
    public Insect(String type, String name, int age, double weight, int wingCount) {
        super(type, name, age, weight);
        this.wingCount = wingCount;
        number = getCounter();
    }
    public Insect(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
        super(type, name, age, weight, isFly, isWalk, isSwim);
        number = getCounter();
    }
    public Insect(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim, int wingCount) {
        super(type, name, age, weight, isFly, isWalk, isSwim);
        this.wingCount = wingCount;
        number = getCounter();
    }
    public int getWingCount() {return wingCount;}
    public void setWingCount(int wingCount) {this.wingCount = wingCount;}
    public boolean isLikeJesus() {return likeJesus;}
    public void setLikeJesus(boolean likeJesus) {this.likeJesus = likeJesus;}
    public void buzz() {System.out.println("Brrrrrrrrrr");}
    public int getNumber() {return number;}
    public static void getClassDescription() {System.out.println(description);}
    @Override
    public void display() {
        System.out.printf("" +
                "Type: %s, " +
                "Name: %s, " +
                "Age: %d, " +
                "Weight: %.4f, " +
                "Number of wings: %d, " +
                "Does it fly: %s, " +
                "Does it walk: %s, " +
                "Does it swim: %s%n", getType(), getName(), getAge(), getWeight(), wingCount, isFly() ? "Yes" : "No", isWalk() ? "Yes" : "No", isSwim() ? "Yes" : "No");
    }
    @Override
    public String toString() {
        return String.format("[%d] " +
                "Type: %s, " +
                "Name: %s, " +
                "Age: %d, " +
                "Weight: %.1f, " +
                "Does it fly: %s, " +
                "Does it walk: %s, " +
                "Does it swim: %s", number, getType(), getName(), getAge(), getWeight(), isFly() ? "Yes" : "No", isWalk() ? "Yes" : "No", isSwim() ? "Yes" : "No");
    }
}
