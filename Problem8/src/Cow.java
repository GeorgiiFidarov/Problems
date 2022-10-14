class Cow {
    int Age;

    public Cow(int age) {
        Age = age;
    }
    public int getAge() {
        return Age;
    }
    public void setAge(int age) {
        Age = age;
    }
    public void printAll(){ //метод всёвызывалка
        System.out.println(printColor()+" "+printName());

    }
    public String printColor() {
        return "I am white";
    }

    public String printName() {
        return "I am cow, now a Whale";
    }
}
