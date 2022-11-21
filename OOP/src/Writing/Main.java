package Writing;

class Main{
    public static void main(String[] args) {
        Pen p = new Pen();
        p.setName("Паркер");
        p.setColor("Синий");
        p.setLength(11);
        p.setPrice(400);
        p.setCountColor(2);
        p.setAuto(false);
        p.display();
        p.writeMyName();

        Ruler r = new Ruler();
        r.setName("Линейка");
        r.setColor("Серый");
        r.setLength(21.1);
        r.setPrice(2);
        r.setWood(true);
        r.display();
        r.measure();

        Divider d = new Divider();
        d.setName("Циркуль");
        d.setDividerType("С карандашом");
        d.setColor("Синий");
        d.setPrice(50);
        d.setLength(3);
        d.setMetal(true);
        d.display();
        d.draw_circle();
    }
}