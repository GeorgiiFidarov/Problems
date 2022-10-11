import java.util.Objects;

/**
 * Дан класс ComplexNumber. Переопределите в нем методы      |
 * equals() и hashCode() так, чтобы equals() сравнивал       |
 * экземпляры ComplexNumber по содержимому полей re и im,    |
 * а hashCode() был бы согласованным с реализацией equals(). |
 *--- Реализация hashCode(), возвращающая константу или не   |
 * учитывающая дробную часть re и im, засчитана не будет     |
 * ----------------------------------------------------------|
 * Пример:
 * ComplexNumber a = new ComplexNumber(1, 1);
 * ComplexNumber b = new ComplexNumber(1, 1);
 * // a.equals(b) must return true
 * // a.hashCode() must be equal to b.hashCode()
 */
public final class ComplexNumber {



    public static void main(String[] args) {
        Cheking Bmw = new Cheking("Almera",50000,1968);
        Cheking Nissan = new Cheking("Almera",50000,1968);
        System.out.println(Bmw.equals(Nissan)+" Bmw equals Nissan "+"\n"+
                "{HashCode "+Bmw.hashCode()+"=BMW }"+
                "{HashCode "+Nissan.hashCode()+"=NISSAN }");

        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(1, 1);
        System.out.println(a.equals(b));//must be true
        System.out.println(a.hashCode() == b.hashCode());//must be true
        System.out.println(a.hashCode()+" "+b.hashCode());
    }
    private final double re;
    private final double im;
    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }
    public double getRe() {
        return re;
    }
    public double getIm() {
        return im;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj==null||getClass() != obj.getClass()) return false;
        ComplexNumber reEquals = (ComplexNumber) obj;
        return Double.compare(reEquals.re, im)==0&&Double.compare(reEquals.im,re)==0;
        // сравнение;
    }
    @Override
    public int hashCode() {
        return Objects.hash(re,im);// сравнение черес класс Objects
    }
}