import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Streams {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);


        FileInputStream inputStream = new FileInputStream("d:/"+scan.nextLine()+".txt");
        int[] size = new int[inputStream.available()];
        int i = 0;
        while (inputStream.available()>0){
            int data = inputStream.read();
            size[i] = data;
            i++;

        }
        int cont = 0;
        for (int x = 0;x<=size.length;x++){
            if (size[x]==size[size.length])
                cont++;

        }
        System.out.println(cont);

        inputStream.close();
        System.out.println(Arrays.toString(size));
        System.out.println(Arrays.stream(size).min().orElseThrow()+" min");
        System.out.println(Arrays.stream(size).max().orElseThrow()+" max");


    }
}
