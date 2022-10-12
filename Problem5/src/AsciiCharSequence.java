
/**
 * Напишите класс AsciiCharSequence,
 * реализующий компактное хранение последовательности
 * ASCII-символов (их коды влезают в один байт) в массиве байт.
 * По сравнению с классом String, хранящим каждый символ как char,
 * AsciiCharSequence будет занимать в два раза меньше памяти.

 * Класс AsciiCharSequence должен:

 * - реализовывать интерфейс java.lang.CharSequence;
 * - иметь конструктор, принимающий массив байт;
 * - определять методы length(), charAt(), subSequence() и toString()
 */
class AsciiCharSequence implements java.lang.CharSequence {
    private final byte[] bytes;
    public AsciiCharSequence(byte[]bytes){
        this.bytes=bytes.clone();
    }
    @Override
    public int length() {
        return bytes.length;
    }
    @Override
    public char charAt(int i) {
        return (char)bytes[i];
    }
    @Override
    public String toString(){
        return new String(bytes);
    }
    public AsciiCharSequence subSequence(int i,int j){
        byte[] ex = new byte[j-i];
        for (int a=0;a<j-i;a++)
            ex[a]=(byte) this.charAt(i+a);
        return new AsciiCharSequence(ex);}}