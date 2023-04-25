import java.io.File;
import java.io.IOException;

public class FileInformation {
    public static void main(String[] args) {

        File file =  new File("C:newfile.txt");

        try {

            if(file.exists()) {
                System.out.println("The file name is "+ file.getName());
                System.out.println("The path of file "+ file.getAbsolutePath());
                System.out.println("The length of file in bytes "+ file.length());
                System.out.println("Can we read file "+ file.canRead());
                System.out.println("Can we write file "+ file.canWrite());
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
