import java.util.Arrays;

public class MyLinkedList {

    private Node first;//
    private int size;

    public void add(int value){
        //если это первое добавление в список
        if (first == null){
            //если первый элемент null то first = Node(value);
            this.first = new Node(value);
        }else {
            Node temp = first;//временный узел temp
            while (temp.getNext() != null){
                temp = temp.getNext();
            }
            // [1]->[2]->[3]
            temp.setNext(new Node(value));
            // [1]->[2]->[3]->[4]
        }

        size++;
    }
    public int get(int index){
        int currentIndex = 0;
        Node temp = first;
        while (temp != null){
            if (currentIndex==index){
                return temp.getItem();
            }else {
                temp = temp.getNext();
                currentIndex++;
            }
        }
        // [1] -> [2] -> [3]
        throw new IllegalArgumentException();
    }
    public void remove(int index){
        if (index == 0) {
            first = first.getNext();
            size--;
            return;
        }
        int currentIndex = 0;
        Node temp = first;
        while (temp!=null){
            if (currentIndex == index - 1){
                temp.setNext(temp.getNext().getNext());
                size--;
                return;
            }else {
                temp = temp.getNext();
                currentIndex++;
            }
        }
        //[1]->[2]->[3]; index = 2;

    }
    //[1] -> [2] -> null
    public String toString(){
        int[] result = new int[size];
        int idx = 0;
        Node temp = first;
        while (temp != null){
            result[idx++] = temp.getItem();
            temp = temp.getNext();

        }
        //[1] -> [2] -> [3]
        return Arrays.toString(result);
    }
    private static class Node{
        private int item;//значение в текущем листе
        private Node next;//ссылка на след узел
        public Node(int item){
            this.item = item;
        }
        public int getItem() {
            return item;
        }
        public void setItem(int item) {
            this.item = item;
        }
        public Node getNext() {
            return next;
        }
        public void setNext(Node next) {
            this.next = next;
        }
    }
}
