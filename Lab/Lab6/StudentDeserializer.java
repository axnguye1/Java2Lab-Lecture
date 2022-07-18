import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class StudentDeserializer {

    public static ObjectInputStream input;

    public static List<Student> openAndReadStudentsFromFile(String filename2) {

        openFile(filename2);
        List<Student> database = readData();
        closeFile();
        return database;
    }

    public static void openFile(String filename2) {

        try {
            input = new ObjectInputStream(Files.newInputStream(Paths.get(filename2)));
        }
        catch (IOException e) {
            System.err.println("Error opening file. Cannot continue and must terminate.");
            System.exit(1); // any nonzero value means terminating in an error state
        }

        System.out.println("Opened the file succesfully");

    }

    public static List<Student> readData() {

        List<Student> data = null;
        try{

            data = (List<Student>)(input.readObject());

        } catch (IOException e) {
            System.err.println("Something went wrong while reading");
        } catch (ClassNotFoundException e) {
            System.err.println("I don't understand what kind of object I just read in");
        }
        return data;
    }

    public static void closeFile() {

        if (input != null)
            try {
                input.close();
            } catch (IOException e) {
                System.err.println("Something went wrong while closing");
            } 
        
        System.out.println("Closed the file succesfully");

    }


} // end class
