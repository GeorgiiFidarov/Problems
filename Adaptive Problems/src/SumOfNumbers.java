import java.util.*;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 456;
        int b,c,d;
        b = a%10;
        c = a/100;
        d = a/10%10;
        System.out.println(b+c+d);

        Deque<Integer> queue = new ArrayDeque<>(Arrays.asList(1,2,3,4));
        queue.add(5);
        queue.pop();
        queue.remove(2);
        System.out.println(queue);

        Set<String> nameSet = new TreeSet<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
        for (String value:nameSet){
            System.out.println(value);
        }
        List<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
        for (int i=0;i< nameList.size();i++){
            System.out.println(nameList.get(i));
        }

    }
}
