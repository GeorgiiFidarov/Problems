class Animal {
    public void getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
    private String type;
    private String name;
    private int age;
    private double weight;
    private boolean isFly, isWalk, isSwim;
    public Animal(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim){
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalk = isWalk;
        this.isSwim = isSwim;
    }
    public Animal(){
    }
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
    public  void display(){
        System.out.println("Тип: " + type + "\n" + "Имя: "
                + name + "\n" + "Возраст: " + age + "\n" + "Вес: "
                + weight + "\n" + "Он летает: " + isFly + "\n" + "Он ходит: "
                + isWalk + "\n" + "Он плавает: " + isSwim);
    }
}