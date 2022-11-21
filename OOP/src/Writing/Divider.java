package Writing;

public class Divider extends WritingMaterials
{
    {
        setDraw(true);
    }
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
    String dividerType;
    boolean metal;
    public void draw_circle(){
        System.out.println("Нарисован круг.\n");
    }
    @Override
    public void display() {
        System.out.println("This is "+getClass());
        super.display();
        System.out.println("Новые свойства класса: \nТип циркуля: "+ getDividerType()
                +"\nМеталлический ли циркуль - "+(isMetal()?"Да":"Нет"));
    }
}
