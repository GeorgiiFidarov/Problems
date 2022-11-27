package Writing;
public class WritingMaterials{
    {
        name = "Имя по умолчанию";
        color  = "цвет по умолчанию";
    }
    String name;
    String color;
    int price;
    double length;
    boolean draw;
    public static int getCount() {
        return count;
    }
    static int count;
    static String description = "Базовый клас родитель";
    public WritingMaterials(String name, String color, int price, double length, boolean draw) {
        count++;
        this.name = name;
        this.color = color;
        this.price = price;
        this.length = length;
        this.draw = draw;
    }
    public WritingMaterials(String name, int price) {
        count++;
        this.name = name;
        this.price = price;
    }
    public WritingMaterials() {
        count++;
    }
    public String getDescription() {return description;}
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public boolean isDraw() {
        return draw;
    }
    public void setDraw(boolean draw) {
        this.draw = draw;
    }
    public void display(){
        System.out.println("Название: "+ getName()+
                "\nЦвет: "+getColor()+
                "\nДлина: "+getLength()+
                "\nЦена: "+getPrice()+
                "\nУмеет рисовать:"+(isDraw()?"Да":"Нет"));
    }
    public void replaceRod(String newColor){
        color = newColor;
        System.out.println(newColor);
    }
    public void priceUp(int priceUp){
        System.out.println(price+priceUp);
    }
    public void priceDown(int priceDown){
        System.out.println(price-priceDown);
    }
    public void draw(){
        if (draw){
            System.out.println(name + " провёл линий: 1. Их цвет - "+color);
        }else {
            System.out.println(name+" не может ничего нарисовать.");
        }
    }
    public void draw(int n){
        if (draw){
            System.out.println(name + " провёл линий: "+n+". Их цвет - "+color+".");
        }else {
            System.out.println(name+" не может ничего нарисовать.");
        }
    }
    public void draw(String color){
        if (draw){
            System.out.println(name + " провёл линий: 1. Их цвет - "+color+".");
        }else {
            System.out.println(name+" не может ничего нарисовать.");
        }
    }
    public void draw(String color,int n){
        if (draw){
            System.out.println(name + " провёл линий: "+n+". Их цвет - "+color+".");
        }else {
            System.out.println(name+" не может ничего нарисовать.");
        }
    }
    public static void info(){
        System.out.printf(description);
    }
    @Override
    public String toString() {
        return "WritingMaterials{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", length=" + length +
                ", draw=" + (isDraw()?"Да":"Нет") +
                ", Номер= "+ count +'}';
    }
}