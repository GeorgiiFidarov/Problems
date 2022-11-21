package Writing;

public class Ruler extends WritingMaterials{
    {
        setDraw(false);
    }
    int length;
    boolean wood;
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
}
