package org.stepic.java.shapes;

public class Shape {
    private final Color color; //класс определяющий цвет

    public Shape (Color color) {
        this.color=color;
    }
    public Color getColor() {
        return color;
    }
    public double getArea() { // класс вычисляет площадь
        return Double.NaN;
    }
}