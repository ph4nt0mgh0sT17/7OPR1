package cz.osu;

public class Student extends Person {
    private String fieldOfStudy;

    //<editor-fold desc="Constructor">

    public Student(String name, int ageYear, String fieldOfStudy) {
        super(name, ageYear);
        this.fieldOfStudy = fieldOfStudy;
    }

    //</editor-fold>

    //<editor-fold desc="Getters and Setters">

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }
    //</editor-fold>


    @Override
    public String toString() {
        return "Student{" +
                "fieldOfStudy='" + fieldOfStudy + '\'' + ", " +
                super.toString() +
                '}';
    }
}
