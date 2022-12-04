import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.Arrays;

public class Program {
    Desktop desktop = Desktop.getDesktop();
    public static void main(String[] args) throws IOException {
        String pathToFile = "C:\\Users\\Georgii\\Desktop\\Projects\\ReadWriteToFile\\file.txt";
        String pathToFolder = "C:\\Users\\Georgii\\Desktop\\Projects\\ReadWriteToFile";
        try(FileWriter writer = new FileWriter(pathToFile,false)){
            String text = "I am writing into the file";
            writer.write(text);
            writer.append('\n');
            writer.write("MotherFuckers will Fuck\nand FatherFuckers will Suck");
            File file = new File(pathToFile);
            Desktop desktop = Desktop.getDesktop();
            //desktop.open(file);

            writer.flush();
        }catch (IOException i){
            System.out.println(i.getMessage());
        }
        try (FileReader reader = new FileReader(pathToFile)){
            char[] buf = new char[256];
            int c;
            while ((c = reader.read(buf))>0){
                if (c<256){
                    buf = Arrays.copyOf(buf,c);
                }
                System.out.println(buf);
            }
        }catch (IOException i){
            System.out.println(i.getMessage());
        }
        String pathToFile1 = "C:\\Users\\Georgii\\Desktop\\Projects\\ReadWriteToFile\\file1.txt";
        File newFile = new File(pathToFile1);
        String text = "Written by PrintStream";
        try(FileOutputStream fos = new FileOutputStream(pathToFile1);
            PrintStream printStream = new PrintStream(fos)) {
            printStream.println(text);
            printStream.printf("Name: %s  \nAge: %d","Tom",32);
            System.out.println("Записал");
            Desktop desktop = Desktop.getDesktop();
            //desktop.open(newFile);


        }catch (IOException i){
            System.out.println(i.getMessage());
        }
        File file = new File(pathToFolder+"\\shit.txt");
        try(PrintStream printStream = new PrintStream(file)) {
            printStream.println("A day after night");
            printStream.printf("Name: %s \n Surname: %s \n Age: %d", "Jack","Johns",15);
            printStream.print("\nBorn in Alaska\n");

            String message = "End";
            byte [] messageToBytes = message.getBytes();
            printStream.write(messageToBytes);

        }catch (FileNotFoundException f){
            System.out.println(f.getMessage());
        }catch (IOException e) {
            throw new NullPointerException();
        }
        Program program = new Program();
        program.desktop.open(file);
    }
}
