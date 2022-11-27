package Zoopark;

import Writing.Pen;
import Writing.Ruler;
import Writing.WritingMaterials;

class Main{
    public static void main(String[] args) {
        Ruler ruler = new Ruler("Линейка","Синий",100,20.0,false);
        System.out.println(ruler);
        Pen pen = new Pen();
        System.out.println(pen);
        WritingMaterials penciloto = new Pen("Ручка","Красный",100,15.0,true);
        System.out.println(penciloto);
        ruler.info();
    }
}