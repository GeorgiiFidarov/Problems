import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
/**
 * Digital watches display time in the h:mm:ss
 * format (from 0:00:00 to 23:59:59), i.e. first goes the number of hours,
 * then goes the two-digit number of minutes, followed by the two-digit
 * number of seconds. If necessary, number of minutes and seconds
 * are filled by zeroes to a two-digit number.
 --------------------------------------------------------------------
 * Sample Input 3602/Sample Output 1:00:02
 --------------------------------------------------------------------
 * Sample Input 129700/Sample Output 12:01:40
 */
public class Solution1 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int givenSeconds = input.nextInt();
        LocalTime a = LocalTime.of(0,0,0);
        System.out.println(a);
        LocalTime z = a.plus(Duration.ofSeconds(givenSeconds));//now
        DateTimeFormatter formatter  = DateTimeFormatter.ofPattern("H:mm:ss");
        String text = z.format(formatter);
        System.out.print(text);;
    }
}