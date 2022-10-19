import java.io.FileInputStream;

public class Skyscraper {
    private int floorsCount;
    private String developer;

    public Skyscraper(){
        this.floorsCount = 5;
        this.developer = "JavaRushDevelopment";
    }
    public Skyscraper(int floorsCount, String developer){
        this.floorsCount = floorsCount;
        this.developer = developer;
    }

    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperUnknown = new Skyscraper(50, "Неизвестно");

        System.out.println(skyscraper);
        System.out.println(skyscraperUnknown);
    }

}
class Cat{
    public String name;
    public int age = -1;

    public Cat(String name, int age)
    {
        this.age = age;
        this.name = name;
    }
    public Cat() //пустой конструктор ебучий
    {
        this.name = "Безымянный"; //перезатираем новое значение
    }
    Cat cat = new Cat();//вызов безымянного типа
    Cat cat1 = new Cat("hui", 3); //вызов конструктора
}
class FilePrinter{
    public String content;
    public FilePrinter(String filename) throws Exception{
        FileInputStream input = new FileInputStream(filename);
        byte[] buffer = input.readAllBytes();
        this.content = new String (buffer);
    }
    public void printFile(){
        System.out.println(content);
    }
}


