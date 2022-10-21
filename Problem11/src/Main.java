import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;


/*
public class Main

    public static void main(String[] args) throws IOException {
        byte[] array = {0x33,0x45,0x01};
        InputStream inputStream = new ByteArrayInputStream(array);
        int b = checkSumOfStream(inputStream);
        int n =  '\n',z = '\r';
        System.out.println("r-"+z+"n-"+n);
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int result = 0;
        int b;
        while ((b=inputStream.read())>0){
            result = (Integer.rotateLeft(result, 1) ^ ((byte)b & 0xFF));
        }
        return result;
    }
}
 */
class FromWinToUnix{
    public static void main(String[] args) throws IOException {
        int next =0;
        int prev = System.in.read();
        while (prev!=-1){
            next = System.in.read();
            if (prev != 13|| next != 10){
                System.out.println(prev);
            }
            prev=next;
        }
        System.out.flush();
    }
}