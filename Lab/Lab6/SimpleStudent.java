import java.io.Serializable;

public class SimpleStudent implements Comparable<SimpleStudent>,Serializable {

    private int studentID;
    private String lastName;
    private String firstName;
    private String middleInitial;

    public SimpleStudent() {
        studentID = 0;
        lastName = "";
        firstName = "";
        middleInitial = "";
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getStudentID() {
        return this.studentID;
    }

    public void setFirstName(String n) {
        this.firstName = n;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String n) {
        this.lastName = n;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setMiddleInitial(String n) {
        this.middleInitial = n;
    }

    public String getMiddleInitial() {
        return this.middleInitial;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Student)
            return (studentID == ((Student)other).getStudentID());
        return false;
    }

    public String toString() {
        String returnVal = "";
        returnVal += studentID + " : " + firstName + " " + middleInitial + " " + lastName;
        return returnVal;
    }

    @Override
    public int compareTo(SimpleStudent other) {
    
        // remember:  somewhere outside of this object theres going to be a construction
        //            that looks like this
        //            student1.compareTo(student2)

        if (this.studentID < other.getStudentID())
            return -1;
        else if (this.studentID > other.getStudentID())
            return 1;
        return 0;     
    
    }
    
}
