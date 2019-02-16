package school;

public class Discipline {

    private String disciplineName;
    private int numberOfLessons;
    private int numberOfWorkshops;

    public Discipline(String disciplineName, int numberOfLessons, int numberOfWorkshops) {

        this.disciplineName = disciplineName;
        this.numberOfLessons = numberOfLessons;
        this.numberOfWorkshops = numberOfWorkshops;
        System.out.println("New discipline created");
    }
}
