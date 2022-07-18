import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.ArrayList;


public class SimpleStudentDeserializer {

    public static ObjectInputStream input;

    public static List<SimpleStudent> openAndReadStudentsFromFile(String filename) {

        openFile(filename);
        List<SimpleStudent> database = readData();
        closeFile();
        return database;
    }

    public static void openFile(String filename) {

        try {
            input = new ObjectInputStream(Files.newInputStream(Paths.get(filename)));
        }
        catch (IOException e) {
            System.err.println("Error opening file. Cannot continue and must terminate.");
            System.exit(1); // any nonzero value means terminating in an error state
        }

        System.out.println("Opened the file succesfully");

    }

    public static List<SimpleStudent> readData() {

        List<SimpleStudent> data = null;
        try{

            data = (List<SimpleStudent>)(input.readObject());

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
