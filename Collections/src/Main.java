import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> linkedList = new LinkedList<>();
        List<Integer> list = new LinkedList<>();
        list.add(1);
        System.out.println(list.size()+" list size");
        List<Integer> arrayList = new ArrayList<>();




        measureTime(linkedList);//долго добавляет
        measureTime(arrayList);//короче намного быстрее этот метод

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add(8);
        myLinkedList.add(2);
        myLinkedList.add(10);
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(2));
        myLinkedList.remove(0);
        System.out.println(myLinkedList);
    }
    private static void measureTime(List<Integer> list){

        long start = System.currentTimeMillis();//показывает текущее время в миллисекундах
        for (int i = 0;i<100000;i++){
            list.add(0,i);
            //[] => [0] => [1][0] => [2][1][0]
            //[] => [0] => [0][1] => [0][1][2]
        }
        long end = System.currentTimeMillis();//конечное время
        System.out.println(end-start);
    }
}