import java.util.NoSuchElementException;
import java.util.Objects;

public final class Optional<T>{
    private final T value;

    public Optional (T value){
        this.value = Objects.requireNonNull(value);
    }

    public static <T> Optional<T> of (T value){
        return new Optional<>(value);
    }


    public T get(){
        if (value == null){
            throw new NoSuchElementException("No value present");
        }
    return value;
    }
}