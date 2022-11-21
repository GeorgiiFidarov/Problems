package Writing;

public class Pen extends WritingMaterials {
    {
        setDraw(true);
    }
    int countColor;
    boolean auto;
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
        System.out.println("This is "+getClass());
        super.display();
        System.out.println("Новые свойства класса:\nКоличество цветов "+ getCountColor()
                +"\nАвтоматическая ли ручка - "+(isAuto()?"Да":"Нет"));
    }
}
