package school;

public class Discipline extends Teacher {

    private String disciplineName;
    private int numberOfLessons;
    private int numberOfWorkshops;


    public Discipline(String classID, String name, String disciplines, String disciplineName, int numberOfLessons, int numberOfWorkshops) {
        super(classID, name, disciplines);
        this.disciplineName = disciplineName;
        this.numberOfLessons = numberOfLessons;
        this.numberOfWorkshops = numberOfWorkshops;
        System.out.println("New discipline created");
    }
}
