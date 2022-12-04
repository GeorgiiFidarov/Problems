import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String formula = scan.nextLine();
        scan.close();
        String[] calculation = formula.split(" ");

            if (calculation[1].contains("*")) {
                try {
                    System.out.println((double)Integer.parseInt(calculation[0]) * Integer.parseInt(calculation[2]));
                } catch (NumberFormatException e) {
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
