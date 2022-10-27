/**
 * <recursion>
 * Given the sequence of numbers,
 * ending with number 0.
 * Find the sum of all these numbers without using a loop.

 * Sample Input:

 * 1
 * 7
 * 9
 * 0
 * Sample Output:

 * 17
 */

import java.util.Scanner;
public class SumOfNumbersNoLoop {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){

        int a = scan.nextInt();
        if (a == 0) {
            System.out.println(0);
            return;
        }
        System.out.println(sum(a));
    }
    public static int sum(int x){
        int y = scan.nextInt();
        if (y == 0)
            return x;
        else
            return sum(x+y);
    }
}
