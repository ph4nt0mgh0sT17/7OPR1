package cz.osu.models;

public class Student extends Person {

    private String universityName;
    private String branchOfStudy;

    public Student(String name, char sex, BirthDate birthDate, Address address, String universityName, String branchOfStudy) {
        super(name, sex, birthDate, address);
        this.universityName = universityName;
        this.branchOfStudy = branchOfStudy;
    }

    public String getUniversityName() {
        return universityName;
    }

    public String getBranchOfStudy() {
        return branchOfStudy;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Student{" +
                "universityName='" + universityName + '\'' +
                ", branchOfStudy='" + branchOfStudy + '\'' +
                '}';
    }
}
