import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class GenerateRandomStudents {

    public static List<SimpleStudent> makeSimpleStudents(int numNames) {

        String[] firstNames = {"Joe","Rashonda","Louis","Dang","Leonard","Steve","Stacey","Greg","James","Joan","Haydar","Lucy","Chris","Jamal","Stan","Alice","Xinyue","Josie","Jose","Kendra","T-Bob","Maria","Andrew","Jill","Lars","Denise","Doug","Xavier","Francine","Ann","Sridhar","Bhupinder","Jason","Walter","Brian","Nancy","Michael","Thien"};

        String[] middleInitials = {"A.","B.","C.","D.","E.","F.","G.","H.","I.","J.","K.","L.","M.","N.","O.","P.","Q.","R.","S.","T.","U.","V.","W.","X.","Y.","Z."};

        String[] lastNames = {"Jackson","Boudreaux","Thibodeaux","Landry","Nemoy","Kirk","Levitt","Pham","Nguyen","Wynn","Schwing","Johnson","Lee","Abdelguerfi","Bowen","Smith","Jones","Baker","Naquin","Sennheiser","Keonnigsegg","Stuart","Tudor","Abromov","Jaeger","Jarndyce","Cooper","Dufresne","Singh","Grisham","Humbert","Einstein","Feynman","Marsalis","Fang","Chen","Charagundala"};

        List<SimpleStudent> database = new ArrayList<SimpleStudent>();

        Random rng = new Random();
        for (int i=0; i<numNames; i++) {
            SimpleStudent s = new SimpleStudent();
            // make a name
            String firstName = firstNames[rng.nextInt(firstNames.length)];
            String lastName = lastNames[rng.nextInt(lastNames.length)];
            String middleInitial = middleInitials[rng.nextInt(middleInitials.length)];
            int studentID = rng.nextInt(999999) + 2000000;
            s.setStudentID(studentID);
            s.setFirstName(firstName);
            s.setLastName(lastName);
            s.setMiddleInitial(middleInitial);
            database.add(s);
        }
        return database;

    }

    public static List<Student> makeStudents(int numNames) {

        String[] firstNames = {"Joe","Rashonda","Louis","Dang","Leonard","Steve","Stacey","Greg","James","Joan","Haydar","Lucy","Chris","Jamal","Stan","Alice","Xinyue","Josie","Jose","Kendra","T-Bob","Maria","Andrew","Jill","Lars","Denise","Doug","Xavier","Francine","Ann","Sridhar","Bhupinder","Jason","Walter","Brian","Nancy","Michael","Thien"};

        String[] middleInitials = {"A.","B.","C.","D.","E.","F.","G.","H.","I.","J.","K.","L.","M.","N.","O.","P.","Q.","R.","S.","T.","U.","V.","W.","X.","Y.","Z."};

        String[] lastNames = {"Jackson","Boudreaux","Thibodeaux","Landry","Nemoy","Kirk","Levitt","Pham","Nguyen","Wynn","Schwing","Johnson","Lee","Abdelguerfi","Bowen","Smith","Jones","Baker","Naquin","Sennheiser","Keonnigsegg","Stuart","Tudor","Abromov","Jaeger","Jarndyce","Cooper","Dufresne","Singh","Grisham","Humbert","Einstein","Feynman","Marsalis","Fang","Chen","Charagundala"};

        String[] ethnicities = {"Asian","Hispanic/Latino","White","Black/African American","Two or more races","Native American","Not Specified"};
        String[] fafsaOrNot = {"Y","N"};

        String[] subPlans = {"BIOINFORM","INFASSUR","GAMEDEV",""};
        String[] genders     = {"M","F"};

        List<Student> database = new ArrayList<Student>();

        Random rng = new Random();
        for (int i=0; i<numNames; i++) {
            Student s = new Student();
            // make a name
            String firstName = firstNames[rng.nextInt(firstNames.length)];
            String lastName = lastNames[rng.nextInt(lastNames.length)];
            String middleInitial = middleInitials[rng.nextInt(middleInitials.length)];
            String name = "\"" + lastName + ", " + firstName + " " + middleInitial + "\"";
            double gpa = 1.0 + rng.nextDouble() * 3.0;
            String sex = genders[rng.nextInt(genders.length)];
            int studentID = rng.nextInt(999999) + 2000000;
            String ethnicGrp = ethnicities[rng.nextInt(ethnicities.length)];
            String fafsa = fafsaOrNot[rng.nextInt(fafsaOrNot.length)];
            String subPlan = subPlans[rng.nextInt(subPlans.length)];
            int strtLevel = rng.nextInt(40);
            double total = 4.0 * rng.nextInt(8);
            double takePrgrs = (double)(rng.nextInt(18)+1);
            double financialNeed = (double)(rng.nextInt(10000));
            s.setStudentID(studentID);
            s.setSex(sex);
            s.setEthnicGroup(ethnicGrp);
            s.setFirstName(firstName);
            s.setLastName(lastName);
            s.setMiddleInitial(middleInitial);
            s.setProgram("USCI");
            s.setAcademicPlan("CSCI");
            s.setSubPlan(subPlan);
            s.setStrtLevel(strtLevel);
            s.setTotal(total);
            s.setGPA(gpa);
            s.setFAFSA(fafsa);
            s.setTakePrgrs(takePrgrs);
            s.setFinancialNeed(financialNeed);
            database.add(s);
        }
        return database;
    }
}
