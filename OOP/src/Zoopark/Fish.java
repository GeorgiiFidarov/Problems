package Zoopark;

public final class Fish extends Animal{
    private String scale;
    private boolean freshwaterOrSaltwaterFish;
    private int number;
    private final static String description = "The Fish class is a subclass of the Animal class.";
    public Fish() {
        number = getCounter();
    }
    public Fish(String type, String name) {
        super(type, name);
        number = getCounter();
    }
    public Fish(String type, int age) {
        super(type, age);
        number = getCounter();
    }
    public Fish(String type, String name, int age) {
        super(type, name, age);
        number = getCounter();
    }
    public Fish(String type, String name, int age, double weight) {
        super(type, name, age, weight);
        number = getCounter();
    }
    public Fish(String type, String name, int age, double weight, String scale) {
        super(type, name, age, weight);
        this.scale = scale;
        number = getCounter();
    }
    public Fish(String type, String name, int age, double weight, boolean freshwaterOrSaltwaterFish) {
        super(type, name, age, weight);
        this.freshwaterOrSaltwaterFish = freshwaterOrSaltwaterFish;
        number = getCounter();
    }
    public Fish(String type, String name, int age, double weight, String scale, boolean freshwaterOrSaltwaterFish) {
        super(type, name, age, weight);
        this.scale = scale;
        this.freshwaterOrSaltwaterFish = freshwaterOrSaltwaterFish;
        number = getCounter();
    }
    public Fish(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
        super(type, name, age, weight, isFly, isWalk, isSwim);
        number = getCounter();
    }
    public Fish(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim, String scale) {
        super(type, name, age, weight, isFly, isWalk, isSwim);
        this.scale = scale;
        number = getCounter();
    }
    public Fish(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim, boolean freshwaterOrSaltwaterFish) {
        super(type, name, age, weight, isFly, isWalk, isSwim);
        this.freshwaterOrSaltwaterFish = freshwaterOrSaltwaterFish;
        number = getCounter();
    }
    public Fish(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim, String scale, boolean freshwaterOrSaltwaterFish) {
        super(type, name, age, weight, isFly, isWalk, isSwim);
        this.scale = scale;
        this.freshwaterOrSaltwaterFish = freshwaterOrSaltwaterFish;
        number = getCounter();
    }
    public String getScale() {return scale;}
    public void setScale(String scale) {this.scale = scale;}
    public boolean isFreshwaterOrSaltwaterFish() {return freshwaterOrSaltwaterFish;}
    public void setFreshwaterOrSaltwaterFish(boolean freshwaterOrSaltwaterFish) {this.freshwaterOrSaltwaterFish = freshwaterOrSaltwaterFish;}
    public int getNumber() {return number;}
    public static void getClassDescription() {System.out.println(description);}
    public void babble() {System.out.println("Bul-bul");}
    @Override
    public void display() {
        System.out.printf("" +
                "Type: %s, " +
                "Name: %s, " +
                "Age: %d, " +
                "Weight: %.1f, %s, " +
                "Does it fly: %s, " +
                "Does it walk: %s, " +
                "Does it swim: %s%n", getType(), getName(), getAge(), getWeight(), freshwaterOrSaltwaterFish ? "Saltwater" : "Freshwater", isFly() ? "Yes" : "No", isWalk() ? "Yes" : "No", isSwim() ? "Yes" : "No");
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