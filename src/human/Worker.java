package human;

public class Worker extends Human {

  private float wage;
  private float workHours;

  public Worker(String firstName, String lastName, float wage, float workHours) {
    super(firstName, lastName);
    this.wage = wage;
    this.workHours = workHours;
  }

  public Worker () {
    this.wage = wage;
    this.workHours = workHours;

  }

  public Worker(float wage, float workHours) {
    this.wage = wage;
    this.workHours = workHours;
  }

  float getHourlyWage () {
    return wage / workHours;

  }

}
