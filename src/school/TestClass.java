package school;

public class TestClass {

    public static void main(String[] args) {

        Discipline discipline = new Discipline ("Class A1", "Maths", "Sciences", "Maths",12,8);
        System.out.println(discipline.getDisciplines());

        Student student = new Student("Class A1", "Asen", 12345);
        System.out.println(student.getStudentID());
        System.out.println(student.getStudentName());

        Teacher teacher = new Teacher("Class A1", "Mr Ivanov", "Sciences");
        System.out.println("now testing teacher ---");
        System.out.println(teacher.getclassID());
        System.out.println(teacher.getDisciplines());
        System.out.println(teacher.getName());



    }


}
