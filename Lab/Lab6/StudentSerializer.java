import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class StudentSerializer {

    public static ObjectOutputStream output;

    public static void openAndWriteStudentsToFile(String filename2, List<Student> data) {

        openFile(filename2);
        writeData(data);
        closeFile();
    }

    public static void openFile(String filename2) {

        try {
            output = new ObjectOutputStream(Files.newOutputStream(Paths.get(filename2)));
        }
        catch (IOException e) {
            System.err.println("Error opening file. Cannot continue and must terminate.");
            System.exit(1); // any nonzero value means terminating in an error state
        }

        System.out.println("Opened the file succesfully");

    }

    public static void writeData(List<Student> data) {

        try {
           output.writeObject(data);
        } catch (IOException e) {
            System.err.println("Something went wrong while writing");
        }
 
    }

    public static void closeFile() {

        if (output != null)
            try {
               output.close();
            } catch (IOException e) {
                System.err.println("Something went wrong while closing");
            }
        
        
        System.out.println("Closed the file succesfully");

    }


} // end class
