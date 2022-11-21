package Zoopark;
class Animal {
    String type;
    String name;
    int age;
    double weight;
    boolean isFly, isWalk, isSwim;
    static final String Description = "Животное обыкновенное ";
    private static int counter;
    {
        name = "Animal";
        type = "Undefined";
    }
    public Animal() {
        ++counter;
    }
    public Animal(String type, String name) {
        this();
        this.type = type;
        this.name = name;
    }
    public Animal(String type, int age) {
        this();
        this.type = type;
        this.age = age;
    }
    public Animal(String type, String name, int age) {
        this(type, name);
        this.age = age;
    }
    public Animal(String type, String name, int age, double weight) {
        this(type, name, age);
        this.weight = weight;
    }
    public Animal(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
        this(type, name, age, weight);
        this.isFly = isFly;
        this.isWalk = isWalk;
        this.isSwim = isSwim;
    }
    public static String getDescription() {return Description;}
    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public boolean isFly() {
        return isFly;
    }
    public void setFly(boolean fly) {
        isFly = fly;
    }
    public boolean isWalk() {
        return isWalk;
    }
    public void setWalk(boolean walk) {
        isWalk = walk;
    }
    public boolean isSwim() {
        return isSwim;
    }
    public void setSwim(boolean swim) {
        isSwim = swim;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void holiday(double m, int n){for (int i = 0; i < n; i++) {this.weight+=n;}}
    public void holiday(int days){
        System.out.println("За " + days +  " дней вес стал " + (weight+=days*0.1) + "кг");
    }
    public void holiday(){
        System.out.println(" Просто увеличил массу" + (weight*=0.1) + "кг");
    }
    public void holiday(double m){
        System.out.println(" Увеличил на m" + (weight+=m) + "кг");
    }
    public final void rename(String newName){name = newName;System.out.println("Новое имя - " + name);}
    public static int getCounter() {return counter;}
    public void display(){
        System.out.print("Тип: "+type+", Имя: "+name+", Возраст: "+age+", Вес: "+weight);
        System.out.print(", Умеет летать: "+(isFly ? "Да" : "Нет"));
        System.out.print(", Умеет ходить: "+(isWalk ? "Да" : "Нет"));
        System.out.println(", Умеет плавать: "+(isSwim ? "Да." : "Нет."));
    }
    public static void info (){
        System.out.println(Description);
    }
    @Override
    public String toString() {
        return "Animal { " +
                "Тип животного = " + type + '\'' +
                "Имя животного = " + name + '\'' +
                "Возраст животного = " + age + '\'' +
                "Вес животного = " + weight + '\'' +
                "Умеет ли оно летать = " + (isFly?"Да":"Нет") + '\'' +
                "Умеет ли оно ходить = " + (isWalk?"Да":"Нет") + '\'' +
                "Умеет ли плавать = " + (isSwim?"Да":"Нет") + '\'' +
                "Номер животного = " + counter + '\'' +
                "Описание животного = "+ Description+ " }";
    }
}