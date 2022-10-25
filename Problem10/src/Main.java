/**
 * Реализуйте метод sqrt(), вычисляющий
 * квадратный корень числа. В отличие от
 * Math.sqrt(), это метод при передаче отрицательного
 * параметра должен бросать исключение java.lang.IllegalArgumentException
 * сообщением "Expected non-negative number, got ?",
 * где вместо вопросика будет подставлено фактически
 * переданное в метод число.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        double z = Dath.sqrt(-1);
    }
}
class Dath{

    public static double sqrt(double x){
        if (x<0)
            throw new IllegalArgumentException("Expected non-negative number, got_ "+x);
        return Dath.sqrt(x);
    }
}
class Solution{
    public String a;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }
}