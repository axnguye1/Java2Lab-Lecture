import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class StudentReader {

    public static Scanner input;

    public static List<Student> openAndReadStudentsFromFile(String filename) {

        openFile(filename);
        List<Student> allStudents = readData();
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

    public static List<Student> readData() {

        // build an ArrayList before I enter the loop so that it will be in score when i leave the loop
        List<Student> theList = new ArrayList<Student>();

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
            String[] fields3 = fields1[4].split(" ");
//            System.out.println("printing fields3 elements:");
//            for (String field : fields3)
//                System.out.println(field);
            String firstName = fields3[1];
//            System.out.println("FIRST NAME: " + firstName);
//            System.out.println("FIELDS3[2]: " + fields3[2]);
            String[] fields4 = fields3[5].split("");
//            System.out.println("printing fields4 elements:");
//            for (String field : fields4)
//                System.out.println(field);
            String middleInitial = fields4[0];

            String[] fields5 = fields4[6].split("");

            String sex = fields5[0];

            String[] fields6 = fields5[7].split("");
            String ethnicGroup = fields6[0];

            String[] fields7 = fields6[8].split("");
            String academicPlan = fields7[0];

            String[] fields8 = fields7[9].split("");
            String subPlan = fields8[0];

            String[] fields9 = fields8[10].split("");
            String strtLevelAsAString = fields9[0];

            String[] fields10 = fields9[11].split("");
            String totalAsAString = fields10[0];

            String[] fields11 = fields10[12].split("");
            String gpaAsAString  = fields11[0];

            String[] fields12 = fields11[13].split("");
            String fafsa  = fields12[0];

            String[] fields13 = fields12[14].split("");
            String takePrgrsAsAString  = fields13[0];

            String[] fields14 = fields5[0].split("");
            String fiancialNeedAsAString  = fields14[0];



            // build a SimpleStudent object using the data from above
            Student student = new Student();

            student.setFirstName(firstName);
            student.setLastName(lastName);
            student.setMiddleInitial(middleInitial);
            int id = Integer.parseInt(idAsAString);
            student.setStudentID(id);
            student.setSex(sex);
            student.setEthnicGroup(ethnicGroup);
            student.setAcademicPlan(academicPlan);
            student.setSubPlan(subPlan);
            int strtLevel = Integer.parseInt(strtLevelAsAString);
            student.setStrtLevel(strtLevel);
            double total = Double.parseDouble(totalAsAString);
            student.setTotal(total);
           double gpa = Double.parseDouble(gpaAsAString);
            student.setGPA(gpa);
            student.setFAFSA(fafsa);
            double takePrgrs = Double.parseDouble(takePrgrsAsAString);
            student.setTakePrgrs(takePrgrs);
            double financialNeed = Double.parseDouble(fiancialNeedAsAString);
            student.setFinancialNeed(financialNeed);


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