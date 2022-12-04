import java.util.Arrays;
import java.util.List;

public class Print {
    void print(String s){
        if (s == null){
            throw new NullPointerException("Exception s: is Null");
        }
        System.out.println("Inside method print");
    }
    public static void main(String[] args) {
        Print print = new Print();
        List<String> list = Arrays.asList("first step",null,"second step");
        for (String s:list){
            try {
                print.print(s);// 0|first step --> go program. 1|null -->
            }catch (NullPointerException n){
                System.out.println(n.getMessage());
                System.out.println("Exception was processed. Program continues");
            }finally {
                System.out.println("Inside block finally");
            }
            System.out.println("Go program");
            System.out.println("-------------");
        }
    }
}
