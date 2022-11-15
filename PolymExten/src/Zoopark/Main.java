package Zoopark;

class Main{
    public static void main(String[] args) {
        Animal duck = new Animal("Утка", "Утя", 3, 5.8, true, true, true);
        duck.display();

        Bird b = new Bird();
        b.setName("Bob");
        b.setArea("На югах");
        b.setWinterFly(false);
        b.display();
        b.chirik_chirik();

        Fish f = new Fish();
        f.setName("Сельд");
        f.setSquama("Крупная");
        f.setUpStreamSwim(true);
        f.display();
        f.bul_bul();

        Insect i = new Insect();
        i.setName("Жук Жукыч");
        i.setWingCount(4);
        i.setLikeJesus(true);
        i.display();
        i.ggg();
    }
}