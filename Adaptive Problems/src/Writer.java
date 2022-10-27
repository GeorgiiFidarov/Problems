import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

public abstract class Writer implements Appendable, Closeable, Flushable {
    public void write(int c) throws IOException{

    }
    public void write(char cbuf[]) throws IOException{
        write(cbuf, 0, cbuf.length);
    }

    public abstract void write(char[] cbuf, int off, int length) throws IOException;

    public abstract void flush() throws IOException;

    public abstract void close() throws IOException;
}

