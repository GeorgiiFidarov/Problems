import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        System.out.println("x1 = "+x1);
        int y1 = scan.nextInt();
        System.out.println("y1 = "+y1);
        int x2 = scan.nextInt();
        System.out.println("x2 = "+x2);
        int y2 = scan.nextInt();
        System.out.println("y2 = "+y2);

        int sum = x1+y1;
        int div = Math.abs(x1-y1);//1-6=5


        if (x1 ==x2||y1 ==y2){
            System.out.println("YES");
        }else if (sum==x2+y2||div == Math.abs(x2-y2)){
            System.out.println("YES");
        }else
            System.out.println("NO");
    }

}