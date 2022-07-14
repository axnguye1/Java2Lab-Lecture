import java.util.Random;

public class MakeRandomSimpleStudents {

    public static void main(String[] args) {

        if (args.length != 1) {
            System.err.println("Usage:  MakeRandomStudents numstudents");
            System.exit(1);
        }

        int numNames = Integer.parseInt(args[0]);

        String[] firstNames = {"Joe","Rashonda","Louis","Dang","Leonard","Steve","Stacey","Greg","James","Joan","Haydar","Lucy","Chris","Jamal","Stan","Alice","Xinyue","Josie","Jose","Kendra","T-Bob","Maria","Andrew","Jill","Lars","Denise","Doug","Xavier","Francine","Ann","Sridhar","Bhupinder","Jason","Walter","Brian","Nancy","Michael","Thien"};

        String[] middleInitials = {"A.","B.","C.","D.","E.","F.","G.","H.","I.","J.","K.","L.","M.","N.","O.","P.","Q.","R.","S.","T.","U.","V.","W.","X.","Y.","Z."};

        String[] lastNames = {"Jackson","Boudreaux","Thibodeaux","Landry","Nemoy","Kirk","Levitt","Pham","Nguyen","Wynn","Schwing","Johnson","Lee","Abdelguerfi","Bowen","Smith","Jones","Baker","Naquin","Sennheiser","Keonnigsegg","Stuart","Tudor","Abromov","Jaeger","Jarndyce","Cooper","Dufresne","Singh","Grisham","Humbert","Einstein","Feynman","Marsalis","Fang","Chen","Charagundala"};

        // output a "header" line that describes the data
        System.out.println("ID,Name");

        Random rng = new Random();
        for (int i=0; i<numNames; i++) {
            Student s = new Student();
            // make a name
            String name = "\"" + lastNames[rng.nextInt(lastNames.length)] + ", " + firstNames[rng.nextInt(firstNames.length)] + " " + middleInitials[rng.nextInt(middleInitials.length)] + "\"";
            int studentID = rng.nextInt(999999) + 2000000;
    
            System.out.println(studentID + "," + name);  

        }
    }
}
