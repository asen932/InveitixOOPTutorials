package school;

public class Teacher extends SchoolClass{

    private String name;
    private String disciplines;

    public Teacher(String classID, String name, String disciplines) {
        super(classID);
        this.name = name;
        this.disciplines = disciplines;

    }

    public String getName() {
        return name;
    }

    public String getDisciplines() {
        return disciplines;
    }

    public String getclassID() {
        return classID;

    }


}

