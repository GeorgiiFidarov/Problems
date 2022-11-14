public class Insect extends Animal{
    {setWalk(true);}

    private int wingCount;
    private boolean likeJesus;


    Insect(){
        super();
        super.type = "Насекомое";
        super.isWalk = true; //Ходить
        this.wingCount = 0;
        this.likeJesus = false;
    }
    public int getWingCount() {
        return wingCount;
    }
    public void setWingCount(int wingCount) {
        this.wingCount = wingCount;
    }
    public boolean isLikeJesus() {
        return likeJesus;
    }
    public void setLikeJesus(boolean likeJesus) {
        this.likeJesus = likeJesus;
    }
    @Override
    public void display(){
        System.out.print("I am Insect. Тип: "+super.type+", Имя: "+super.name);
        System.out.print(", Количество крыльев: " + wingCount);
        System.out.print(", Умеет ходить: "+(isWalk ? "Да" : "Нет"));
        System.out.println(", Умеет ли ходить по воде: " + (likeJesus ? "Да." : "Нет." ));
    }
    public void ggg(){
        System.out.println("Ggggg");
    }
}
