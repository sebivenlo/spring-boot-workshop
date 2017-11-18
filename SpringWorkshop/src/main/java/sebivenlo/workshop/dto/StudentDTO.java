package sebivenlo.workshop.dto;

/**
 *
 * @author merve
 */
public class StudentDTO {

    private int id;
    private String name;
    private String surname;
    private int enrolYear;
    private boolean fullTime;
    private int semester;
    private String degree;
    private String studyProgram;

    public StudentDTO(int id, String name, String surname, int enrolYear, boolean fullTime, int semester, String degree, String studyProgram) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.enrolYear = enrolYear;
        this.fullTime = fullTime;
        this.semester = semester;
        this.degree = degree;
        this.studyProgram = studyProgram;
    }

    public StudentDTO() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getEnrolYear() {
        return enrolYear;
    }

    public boolean isFullTime() {
        return fullTime;
    }

    public int getSemester() {
        return semester;
    }

    public String getDegree() {
        return degree;
    }

    public String getStudyProgram() {
        return studyProgram;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEnrolYear(int enrolYear) {
        this.enrolYear = enrolYear;
    }

    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void setStudyProgram(String studyProgram) {
        this.studyProgram = studyProgram;
    }

}
