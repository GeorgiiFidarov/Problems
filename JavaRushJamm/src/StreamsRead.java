import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

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
