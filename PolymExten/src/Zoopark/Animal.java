package Zoopark;

class Animal {
    public Animal() {
        this.type = "NoType";
        this.name = "NoName";
        this.age = 0;
        this.weight = 0.0;
        this.isSwim = false;
        this.isWalk = false;
        this.isFly = false;
    }
    public Animal(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim){
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isSwim = isSwim;
        this.isWalk = isWalk;
        this.isFly = isFly;
    }
    public Animal(String type, String name){
        this.type=type;
        this.name=name;
    }
    public Animal(String type, int age){
        this.type=type;
        this.name="NoName";
        this.age=age;
    }
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
    String type;
    String name;
    int age;
    double weight;
    boolean isFly, isWalk, isSwim;
    public void holiday(int days){
        System.out.println("За " + days +  " дней вес стал " + (weight+=days*0.1) + "кг");
    }
    public void holiday(){
        System.out.println(" Просто увеличил массу" + (weight*=0.1) + "кг");
    }
    public void holiday(double m){
        System.out.println(" Увеличил на m" + (weight+=m) + "кг");
    }
    public void holiday(double m, int n){
        for (int i = 0; i < n; i++) {
            this.weight+=n;
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void rename(String newName){
        name = newName;
        System.out.println("Новое имя - " + name);
    }
    public void display(){
        System.out.print("Тип: "+type+", Имя: "+name+", Возраст: "+age+", Вес: "+weight);
        System.out.print(", Умеет летать: "+(isFly ? "Да" : "Нет"));
        System.out.print(", Умеет ходить: "+(isWalk ? "Да" : "Нет"));
        System.out.println(", Умеет плавать: "+(isSwim ? "Да." : "Нет."));
    }
}