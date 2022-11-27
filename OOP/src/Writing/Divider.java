package Writing;
public class Divider extends WritingMaterials {
    {
        setDraw(true);
        name = "Циркуль";
        color = "Серый";
    }
    String dividerType;
    boolean metal;
    private int number;
    private final static String description= "Циркуль рисует окружности";
    public Divider(String name, String color, int price, double length, boolean draw) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.length = length;
        this.draw = draw;
        number = getCount();
    }
    public Divider(String name, int price) {
        this.name = name;
        this.price = price;
        number = getCount();
    }
    public Divider() {
        number = getCount();
    }
    public int getNumber() {return number;}
    public String getDividerType() {
        return dividerType;
    }
    public void setDividerType(String dividerType) {
        this.dividerType = dividerType;
    }
    public boolean isMetal() {
        return metal;
    }
    public void setMetal(boolean metal) {
        this.metal = metal;
    }
    public final void draw_circle() {
        System.out.println("Нарисован круг.\n");
    }
    @Override
    public void display() {
        System.out.println("This is " + getClass());
        super.display();
        System.out.println("Новые свойства класса: \nТип циркуля: " + getDividerType()
                + "\nМеталлический ли циркуль - " + (isMetal() ? "Да" : "Нет"));
    }
    @Override
    public String toString() {
        return getName() + "{" +
                "Длинна = " + getLength() +
                ", Дерево =" + (isMetal() ? "Да" : "Нет") +
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
