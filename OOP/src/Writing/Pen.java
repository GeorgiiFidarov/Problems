package Writing;
public class Pen extends WritingMaterials {
    {
        name = "Шариковая ручка";
        color = "Синий";
        setDraw(true);
    }
    int countColor;
    boolean auto;
    private int number;
    private final static String description= "Ручка она поможет написать что то";
    public Pen(String name, String color, int price, double length, boolean draw) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.length = length;
        this.draw = draw;
        number = getCount();
    }
    public Pen(String name, int price) {
        this.name = name;
        this.price = price;
        number = getCount();
    }
    public Pen() {
        number = getCount();
    }
    public int getNumber() {
        return number;
    }
    public int getCountColor() {
        return countColor;
    }
    public void setCountColor(int countColor) {
        this.countColor = countColor;
    }
    public boolean isAuto() {
        return auto;
    }
    public void setAuto(boolean auto) {
        this.auto = auto;
    }
    public void writeMyName() {
        System.out.println("Paolo Costa.\n");
    }
    @Override
    public void display() {
        System.out.println("This is " + getClass());
        super.display();
        System.out.println("Новые свойства класса:\nКоличество цветов " + getCountColor()
                + "\nАвтоматическая ли ручка - " + (isAuto() ? "Да" : "Нет"));
    }
    @Override
    public String toString() {
        return getName() + "{" +
                "Длинна = " + getLength() +
                ", Тип ручки =" + (isAuto() ? "Да" : "Нет") +
                ", color='" + getColor() + '\'' +
                ", price=" + getPrice() +
                ", length=" + getLength() +
                ", draw=" + (isDraw() ? "Да" : "Нет") +
                ", Номер= " + number + '}';
    }
    public static void info(){
        System.out.printf(description);
    }
}
