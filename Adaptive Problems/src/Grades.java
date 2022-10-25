/**
 * The percentage of A in String Array
 *
 */

import java.util.Scanner;


public class Grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input  = scan.nextLine();
        String noSpace = input.replace(" ","");
        double a = noSpace.replaceAll("A","").length() - noSpace.length();
        System.out.println(Math.abs(a/noSpace.length()));
        //String replase = noSpace.replace("A","");
        //System.out.println(replase);
        //double a = noSpace.length()-replase
        //double sum =noSpace.length();
        //double answer = (replase/sum)*100;
        //System.out.println(answer);
    }
}
