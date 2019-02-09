package human;

public class Student extends Human {

  private int score;

  public Student () {

  }

  public Student(String firstName, String lastName, int score) {
    super(firstName, lastName);
    this.score = score;
  }

  public int getScore () {
    return score;
  }

  public void setScore () {
    this.score = score;

  }

}

