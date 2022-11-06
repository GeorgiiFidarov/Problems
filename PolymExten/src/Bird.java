public class Bird extends Animal{
    {setFly(true);}
    private String area;
    private boolean winterFly;



    public Bird() {
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

}
