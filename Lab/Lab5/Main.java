import java.util.List;

public class Main {

    public static void main(String[] args) {

        String filename = "simplestudents.txt";
        List<SimpleStudent> dataFromFile = SimpleStudentReader.openAndReadStudentsFromFile(filename);
        for ( SimpleStudent s : dataFromFile )
            System.out.println(s);

    }


}
