import java.util.List;

public class Main {

    public static void main(String[] args) {

        String filename = "simplestudents.ser";
        List<SimpleStudent> randomDatabase = GenerateRandomStudents.makeSimpleStudents(100);

        SimpleStudentSerializer.openAndWriteStudentsToFile(filename,randomDatabase);

        List<SimpleStudent> deserializedDatabase = SimpleStudentDeserializer.openAndReadStudentsFromFile(filename);
    
        for (SimpleStudent s : deserializedDatabase)
            System.out.println(s);

        String filename2 = "students.ser";
        List<Student> randomDataBase2 = GenerateRandomStudents.makeStudents(100);
        StudentSerializer.openAndWriteStudentsToFile(filename2,randomDataBase2);
        List<Student> deserializedDataBase2 = StudentDeserializer.openAndReadStudentsFromFile(filename2);
        for(Student ss: deserializedDataBase2)
            System.out.println(ss);
    }


}
