import java.awt.*;
import java.io.*;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Desktop desktop = Desktop.getDesktop();
        Scanner scan = new Scanner(System.in);
        String formula = scan.nextLine();
        String[] calculation = formula.split(" ");
        String pathToFolder = "C:\\Users\\Georgii\\Desktop\\Projects\\ReadWriteToFile";
        File file = new File(pathToFolder+"\\output.txt");
        File logfile = new File(pathToFolder+"\\logfile.txt");
        try(PrintStream printStream = new PrintStream(file);
        PrintStream printLog = new PrintStream(logfile)) {
            if (calculation[1].contains("*")) {
                try {
                    printStream.println((double) Integer
                            .parseInt(calculation[0]) * Integer.parseInt(calculation[2]));
                    printStream.close();
                    desktop.open(file);
                } catch (NumberFormatException n) {
                    printLog.print("Please input number!");
                    printLog.close();
                } catch (IOException e) {
                    printLog.println("IOException");
                    printLog.close();
                }
            }
            if (calculation[1].contains("/")) {
                try {
                    printStream.println(Integer
                            .parseInt(calculation[0]) / Integer.parseInt(calculation[2]));
                    printStream.close();
                    desktop.open(file);
                } catch (ArithmeticException e) {
                    printLog.println("Error! Division by zero");
                    printLog.close();
                } catch (NumberFormatException n) {
                    printLog.println("Error! Not number");
                    printLog.close();
                } catch (IOException e){
                    printLog.println(e.getMessage());
                    printLog.close();
                }
            }
            if (formula.contains("+")) {
                try {
                    printStream.println((double) Integer
                            .parseInt(calculation[0]) + Integer.parseInt(calculation[2]));
                    printStream.close();
                    desktop.open(file);
                } catch (NumberFormatException e) {
                    printLog.println("Error! Not number");
                    printLog.close();
                } catch (IOException e){
                    printLog.println(e.getMessage());
                    printLog.close();
                }
            } else if (formula.contains("-")) {
                try {
                    printStream.println((double) Integer
                            .parseInt(calculation[0]) - Integer.parseInt(calculation[2]));
                    printStream.close();
                    desktop.open(file);
                } catch (NumberFormatException e) {
                    printLog.println("Error! Not number");
                    printLog.close();
                } catch (IOException e){
                    System.out.println(e.getMessage());
                    printLog.close();
                }
            }
            try {
                if (!calculation[1].equals("*")
                        && !calculation[1].equals("/")
                        && !calculation[1].equals("+")
                        && !calculation[1].equals("-")) {
                    printLog.println("Parameter please");
                }
            } catch (Exception e) {
                printLog.println("Parameter please");
                printLog.close();
            }
        }catch (FileNotFoundException f){
            System.out.println("Parameter please");
        }
    }
}
