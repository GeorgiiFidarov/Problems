import java.io.*;
import java.lang.reflect.WildcardType;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public abstract class Reader implements Readable, Closeable {
    protected Reader() throws FileNotFoundException {
    }

    public int read() throws IOException{
        return 1;
    }
    public int read(char cbuf[]) throws IOException{
        return 1;
    }
    public abstract int read(char cbuf[],int off,int lan) throws IOException;

    public long skip(long n )throws IOException{
        return 1;
    }
    public abstract void close() throws IOException;


}
