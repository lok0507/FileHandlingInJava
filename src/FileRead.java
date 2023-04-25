import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:newfile.txt");

        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine()) {
            String data = scanner.nextLine();
            System.out.println(data);
        }

        scanner.close();
    }
}
