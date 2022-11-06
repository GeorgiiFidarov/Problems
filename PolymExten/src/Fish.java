public class Fish extends Animal{
    {setSwim(true);}
    private String squama ;
    private boolean upStreamSwim;
    public Fish() {
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
    public void bul_bul(){
        System.out.println("bul_bul");
    }

}