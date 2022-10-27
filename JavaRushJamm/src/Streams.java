import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class Streams {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);


        FileInputStream inputStream = new FileInputStream("d:/tata.txt");
        int[] size = new int[inputStream.available()];
        int i = 0;
        while (inputStream.available()>0){
            int data = inputStream.read();
            size[i] = data;
            i++;
        }
        inputStream.close();


        System.out.println(mostFrequent(size));
        System.out.println(leastFrequent(size));
        System.out.println(Arrays.toString(size));
        System.out.println(Arrays.stream(size).min().orElseThrow()+" min");
        System.out.println(Arrays.stream(size).max().orElseThrow()+" max");
        FileOutputStream outputStream = new FileOutputStream("d:/data.txt");
        Writer writer = new OutputStreamWriter(outputStream, StandardCharsets.UTF_8);
        writer.write("f");
    }
    //finding most frequent
    public static int leastFrequent(int[] size){
        int maxCount = 0;
        int element = 0;
        for (int j : size) {
            int count = 0;
            for (int i : size) {
                if (j != i) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                element = j;
            }
        }
        return element;
    }
    public static int mostFrequent(int[] size){
        int maxCount = 0;
        int element = 0;
        for (int j : size) {
            int count = 0;
            for (int i : size) {
                if (j == i) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                element = j;
            }
        }
        return element;
    }
    public static int sortWithoutDuplicates (int [] size){
        int[] sorted = Arrays.stream(size).sorted().toArray();
        if (size.length == 0||size.length==1) {
            return size.length;
        }
        int [] temp = new int[size.length];
        int j = 0;
        for (int i = 0; i < size.length-1;i++){
            if (size[i]!=size[i+1])
                temp[j++] = size[i];
        }
        temp[j++] = size[size.length-1];

        for (int i = 0; i < j; i++){
            size[i] = temp[i];
        }
        return j;
    }
}
