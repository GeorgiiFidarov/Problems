import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class Adapters{
    public static void main(String[] args) {
        //System.out.println("Hello");
        PrintStream dickhead = System.out;
        dickhead.println("Hello");
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        PrintStream console = new PrintStream(stream);
        console.println("Hello");
    }
}

