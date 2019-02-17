package school;

public class Student extends SchoolClass {

    private String studentName;
    private int studentID;

    public Student(String classID, String studentName, int studentID) {
        super(classID);
        this.studentName = studentName;
        this.studentID = studentID;
    }
}
