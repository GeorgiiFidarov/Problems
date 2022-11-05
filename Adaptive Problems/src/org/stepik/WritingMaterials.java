package org.stepik;
public class WritingMaterials{
    private String name;
    private String color;
    private int price;
    private double length;
    private boolean draw;

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
        System.out.println("Название: "+ name+
                "\nЦвет: "+color+
                "\nДлина: "+length+
                "\nЦена: "+price+
                "\nУмеет рисовать:"+draw);
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
            System.out.println(name+" провёл линию.\n Её цвет - "+color);
        }else {
            System.out.println(name+" не может ничего нарисовать.");
        }
    }
}