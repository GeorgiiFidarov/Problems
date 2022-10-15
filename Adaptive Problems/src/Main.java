import java.util.Scanner;

/**
 * Snail creep
 * Snail creeps up the vertical pole of height H feets. Per day it goes A feets up, and per night it goes B feets down. In which day the snail will reach the top of the pole?
 * Input data format
 * On the input the program receives non-negative integers H, A, B, where H > B and A > B. Every integer does not exceed 100.
 * Sample Input 1:
 * 10
 * 3
 * 2
 * Sample Output 1:
 * 8
 * Sample Input 2:
 * 20
 * 7
 * 3
 * Sample Output 2:
 * 5
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();//высота столба
        int a = scanner.nextInt();//поднимется в день
        int b = scanner.nextInt();//опускается за ночь
        int counter = 0;//счетчик
        while ((h - b) > 0) {//в цикле пока
            counter++;//cчетчик
            h = h - a + b;//из столба вычитаем прополз + скатился


        }
        System.out.println(counter);
    }
}
