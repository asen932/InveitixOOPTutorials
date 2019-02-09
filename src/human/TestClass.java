package human;

public class TestClass {

  public static void main(String[] args) {
    Human human = new Human("Asen", "Yordanov");
    Student student = new Student("Asen", "Yordanov", 123);
    Worker worker = new Worker(1600, 45);

    System.out.println(student.getScore());
    System.out.println(worker.getHourlyWage());

  }

}
