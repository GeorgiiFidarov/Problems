import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class StreamsRead {
    public static void main(String[] args) throws IOException {
        byte[] buf = {48, 49, 50, 51};
        InputStream arr = new ByteArrayInputStream(buf);
        System.out.println(readAsString(arr, StandardCharsets.US_ASCII));
    }

    public static String readAsString(InputStream inputStream, Charset charset)throws IOException {

        String answer;
        Reader reader = new InputStreamReader(inputStream, charset);
        StringWriter r = new StringWriter();
        int b;
        while ((b = reader.read()) != -1){
            r.write(b);
        }
        answer = r.toString();
        return answer;
    }



}

class sdfdsf {
    /**
     * Напишите программу, читающую текст из System.in и
     * выводящую в System.out сумму всех встреченных в тексте
     * вещественных чисел с точностью до шестого знака после запятой.
     * Числом считается последовательность символов,
     * отделенная от окружающего текста пробелами или переводами
     * строк и успешно разбираемая методом Double.parseDouble.

     * На этот раз вам надо написать программу полностью,
     * т.е. объявить класс (с именем Main — таково ограничение проверяющей системы),
     * метод main, прописать все import'ы.
     *
     */
    public static void main(String[] args){
        double sum=0;
        try (Scanner scan = new Scanner(System.in)){
            while(scan.hasNext()){
                if(scan.hasNextDouble()){
                    sum+=Double.parseDouble(scan.next());
                } else {
                    scan.next();
                }
            }

            System.out.printf("%.6f", sum);
        } catch(Exception e){
            System.out.printf("%.6f", 0);
        }
    }
}

