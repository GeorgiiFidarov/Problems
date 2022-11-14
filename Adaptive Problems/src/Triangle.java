import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a/10==1) {System.out.print("X");}
        if(a/10==2) {System.out.print("XX");}
        if(a/10==3) {System.out.print("XXX");}
        if(a/10==4) {System.out.print("XL");}
        if(a/10==5) {System.out.print("L");}
        if(a/10==6) {System.out.print("LX");}
        if(a/10==7) {System.out.print("LXX");}
        if(a/10==8) {System.out.print("LXXX");}
        if(a/10==9) {System.out.print("XC");}
        if(a%10==1) {System.out.print("I");}
        if(a%10==2) {System.out.print("II");}
        if(a%10==3) {System.out.print("III");}
        if(a%10==4) {System.out.print("IV");}
        if(a%10==5) {System.out.print("V");}
        if(a%10==6) {System.out.print("VI");}
        if(a%10==7) {System.out.print("VII");}
        if(a%10==8) {System.out.print("VIII");}
        if(a%10==9) {System.out.print("IX");}
    }
}
