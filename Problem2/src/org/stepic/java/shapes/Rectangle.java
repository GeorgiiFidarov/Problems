package org.stepic.java.shapes;

public class Rectangle extends Shape {

    private final double firstSide;//сторона 1
    private final double secondSide;//сторона 2


    public Rectangle(double firstSide, double secondSide,Color color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }
    @Override
    public double getArea(){
        return secondSide*firstSide;
    }
    @Override
    public String toString(){
        return getColor()+"{ firstSide = "+firstSide+
                " secondSide = "+secondSide+" area = "+getArea()+" }";
    }
}
