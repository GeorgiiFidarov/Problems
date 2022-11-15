package Zoopark;

public class Fish extends Animal{
    {setSwim(true);}
    private String squama ;
    private boolean upStreamSwim;
    Fish(){
        super();
        super.type = "Рыба";
        super.isSwim = true;
        this.squama = "NoArea";
        this.upStreamSwim = false;
    }
    public String getSquama() {
        return squama;
    }
    public void setSquama(String squama) {
        this.squama = squama;
    }
    public boolean isUpStreamSwim() {
        return upStreamSwim;
    }
    public void setUpStreamSwim(boolean upStreamSwim) {
        this.upStreamSwim = upStreamSwim;
    }

    @Override
    public void display(){
        System.out.print("I am Zoopark.Fish. Тип: "+super.type+", Имя: "+super.name);
        System.out.print(", Тип чешуи: " + squama);
        System.out.print(", Умеет плавать: "+(isSwim ? "Да" : "Нет"));
        System.out.println(", Умеет ли плавать против течения: " + (upStreamSwim ? "Да." : "Нет." ));
    }
    public void bul_bul(){
        System.out.println("bul_bul");
    }

}