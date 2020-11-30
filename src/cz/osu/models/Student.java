package cz.osu.models;

/**
 * The student class that has the university name and the branch of study.
 */
public class Student extends Person {

    private final String universityName;
    private final String branchOfStudy;

    /**
     * Construct a student with all data.
     * @param name The name of the person.
     * @param sex The character value of its sex. (M / F)
     * @param birthDate The {@link BirthDate} object that defines the date of the person's birth.
     * @param address The address of the person.
     * @param universityName The name of the university he studies at.
     * @param branchOfStudy The branch of study in the university.
     */
    public Student(String name, char sex, BirthDate birthDate, Address address, String universityName, String branchOfStudy) {
        super(name, sex, birthDate, address);
        this.universityName = universityName;
        this.branchOfStudy = branchOfStudy;
    }

    //<editor-fold desc="Getters">

    public String getUniversityName() {
        return universityName;
    }

    public String getBranchOfStudy() {
        return branchOfStudy;
    }

    //</editor-fold>

    @Override
    public String toString() {
        return super.toString() + "\n\t" + "Student{" +
                "universityName='" + universityName + '\'' +
                ", branchOfStudy='" + branchOfStudy + '\'' +
                '}';
    }
}
