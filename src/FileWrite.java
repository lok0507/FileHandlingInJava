import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) throws IOException {

        try {
            FileWriter fileWriter = new FileWriter("C:newfile.txt");

            fileWriter.write("A named location used to store related information is referred to as a File.");
            fileWriter.close();
            System.out.println("Written successfully");
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
