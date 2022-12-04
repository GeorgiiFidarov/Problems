import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String formula = scan.nextLine();
        String[] calculation = formula.split(" ");
        String pathToFile = "C:\\Users\\Georgii\\Desktop\\Projects\\ReadWriteToFile\\file.txt";
            if (calculation[1].contains("*")) {
                try(PrintStream printStream = new PrintStream(pathToFile)) {
                    printStream.println((double)Integer.parseInt(calculation[0]) * Integer.parseInt(calculation[2]));
                } catch (NumberFormatException | FileNotFoundException e) {
                    System.out.println(e.getMessage() + " Digits only please");
                }
            }
            if (calculation[1].contains("/")) {
                try {
                    System.out.println((double)Integer.parseInt(calculation[0]) / Integer.parseInt(calculation[2]));
                } catch (ArithmeticException e) {
                    System.out.println("Error! Division " + e.getMessage());
                } catch (NumberFormatException n) {
                    System.out.println("Error! Not number");
                }
            }
            if (formula.contains("+")) {
                try {
                    System.out.println((double) Integer.parseInt(calculation[0]) + Integer.parseInt(calculation[2]));
                } catch (NumberFormatException e) {
                    System.out.println(e.getMessage() + " Digits only please");
                }
            } else if (formula.contains("-")) {
                try {
                    System.out.println((double)Integer.parseInt(calculation[0]) - Integer.parseInt(calculation[2]));
                } catch (NumberFormatException e) {
                    System.out.println(e.getMessage() + " Digits only please");
                }
            }
        try {
            if (!calculation[1].equals("*")&&!calculation[1].equals("/")&&!calculation[1].equals("+")&&!calculation[1].equals("-"))
                throw new Exception("Enter right parameter");
        } catch (Exception e) {
            System.out.println("Parameter please");
        }

    }
}
