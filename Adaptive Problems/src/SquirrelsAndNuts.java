import java.util.Scanner;
class SquirrelsAndNuts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int K = scan.nextInt();
        int N = scan.nextInt();

        if(N<10000&&K<10000){
            int answer = N/K;
            System.out.println(answer);
        }

    }
}