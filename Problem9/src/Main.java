public class Main {
    public static void main (String[] args) throws java.lang.Exception
    {
        A a = new B();
        C c = (C) a;
    }


    static class A{}
    static class B extends A{}
    static class C extends A{}
}