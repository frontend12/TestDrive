import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args)  {
        File file = new File("test");

        try {
            Scanner scanner = new Scanner(file);
            System.out.println("yes");

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        System.out.println("полсле блога try catch");
    }
}
