import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws MyException {

        Main main = new Main();
        System.out.println(main.input());


    }
    public String input() throws MyException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = null;

        try {
            s = reader.readLine();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
            try {
                reader.close();
            }catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
        if (s.equals("")){
                throw new MyException("String cannot." +
                        "  be empty");
            }

        return s;
    }
}
class MyException extends Exception{

    String message;
    public MyException(String message) {
        this.message = message;
    }
    public MyException(String message, String message1) {
        super(message);
        this.message = message1;
    }
}