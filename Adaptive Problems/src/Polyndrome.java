import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String result = word.equals(new StringBuilder(word).reverse().toString())? "yes" : "no";
        System.out.println(result);
    }
}