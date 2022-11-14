public class Bird extends Animal{
    {setFly(true);}

    private String area;
    private boolean winterFly;

    Bird() {
        super();
        super.type = "Птица";
        super.isFly = true;
    }


    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public boolean isWinterFly() {
        return winterFly;
    }
    public void setWinterFly(boolean winterFly) {
        this.winterFly = winterFly;
    }
    public void chirik_chirik(){
        System.out.println("Chirik-Chirik");
    }

    @Override
    public void display(){
        System.out.print("I am Bird. Тип: "+super.type+", Имя: "+super.name);
        System.out.print(", Зона обитания: " + getArea());
        System.out.print(", Умеет летать: "+(isFly ? "Да" : "Нет"));
        System.out.println(", Улетает зимовать: " + (winterFly ? "Да." : "Нет." ));
    }

}
