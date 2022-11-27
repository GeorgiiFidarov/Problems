package Writing;
public final class Ruler extends WritingMaterials{
    {
        name = "Линейка";
        color = "Бежевая";
        setDraw(false);
    }
    double length;
    boolean wood;
    private int number;
    private static final String description = "Измеряет линейка длинну";
    public Ruler(String name, String color, int price, double length, boolean draw) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.length = length;
        this.draw = draw;
        number = getCount();
    }
    public Ruler(String name, int price) {
        this.name = name;
        this.price = price;
        number = getCount();
    }
    public Ruler(){
        number = getCount();
    }
    public int getNumber() {return number;}
    public void setLength(int length) {
        this.length = length;
    }
    public boolean isWood() {
        return wood;
    }
    public void setWood(boolean wood) {
        this.wood = wood;
    }
    public void measure(){
        System.out.println("Сейчас померим длину.\n");
    }
    @Override
    public void display() {
        System.out.println("This is "+getClass());
        super.display();
        System.out.println("Новые свойства класса:\nДеревянная ли ручка - "+(isWood()?"Да":"Нет"));
    }
    @Override
    public String toString() {
        return getName() + "{" +
                "Длинна = " + getLength() +
                ", Дерево =" + (isWood()?"Да":"Нет") +
                ", color='" + getColor() + '\'' +
                ", price=" + getPrice() +
                ", length=" + getLength() +
                ", draw=" + (isDraw()?"Да":"Нет") +
                ", Номер= "+ number +'}';
    }
    public static void info(){
        System.out.printf(description);
    }
}
