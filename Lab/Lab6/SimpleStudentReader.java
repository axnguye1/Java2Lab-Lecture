import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class SimpleStudentReader {

    public static Scanner input;

    public static List<SimpleStudent> openAndReadStudentsFromFile(String filename) {

        openFile(filename);
        List<SimpleStudent> allStudents = readData();
        closeFile();

        return allStudents;
    }

    public static void openFile(String filename) {

        try {
            input = new Scanner(Paths.get(filename));
        }
        catch (IOException e) {
            System.err.println("Error opening file. Cannot continue and must terminate.");
            System.exit(1); // any nonzero value means terminating in an error state
        }

        System.out.println("Opened the file succesfully");

    }

    public static List<SimpleStudent> readData() {

        // build an ArrayList before I enter the loop so that it will be in score when i leave the loop
        List<SimpleStudent> theList = new ArrayList<SimpleStudent>(); 
 
        while (input.hasNext()) {
            String wholeLine = input.nextLine();
            // if it's the header, skip it and move on to the next line
            if (wholeLine.equals("ID,Name")) {
                //System.out.println("found the header");
                continue;
            } else
                System.out.println(wholeLine);
            // split the data apart into the relevant fields
            String[] fields1 = wholeLine.split(",");
            for (String field : fields1)
                System.out.println(field);
            String idAsAString = fields1[0];
            String[] fields2 = fields1[1].split("\"");
//            System.out.println("printing fields2 elements:");
//            for (String field : fields2)
//                System.out.println(field);
            String lastName = fields2[1];
//            System.out.println("LAST NAME: " + lastName);
            String[] fields3 = fields1[2].split(" ");
//            System.out.println("printing fields3 elements:");
//            for (String field : fields3)
//                System.out.println(field);
            String firstName = fields3[1];
//            System.out.println("FIRST NAME: " + firstName);
//            System.out.println("FIELDS3[2]: " + fields3[2]);
            String[] fields4 = fields3[2].split(""); 
//            System.out.println("printing fields4 elements:");
//            for (String field : fields4)
//                System.out.println(field);
            String middleInitial = fields4[0];
            // build a SimpleStudent object using the data from above
            SimpleStudent student = new SimpleStudent();
            student.setFirstName(firstName);
            student.setLastName(lastName);
            student.setMiddleInitial(middleInitial); 
            int id = Integer.parseInt(idAsAString);
            student.setStudentID(id);
            // place the SimpleStudent object I just built into the ArrayList<SimpleStudent> 
            theList.add(student);
        }

        return theList;
    }

    public static void closeFile() {

        if (input != null)
            input.close();
        
        System.out.println("Closed the file succesfully");

    }


} // end class
