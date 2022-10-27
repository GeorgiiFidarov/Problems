import java.util.Arrays;
import java.util.Scanner;

public class StarFigure {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        String[][] matrix = new String[length][length];
        for (int i = 0; i < matrix.length;) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i==j || i == length/2 || j == length/2 || (length/2 - i == j - length/2)) matrix[i][j] = "* ";
                else matrix[i][j] = ". ";
                System.out.print(matrix[i][j]);
            }
            System.out.println();
            i++;
        }

    }
}
