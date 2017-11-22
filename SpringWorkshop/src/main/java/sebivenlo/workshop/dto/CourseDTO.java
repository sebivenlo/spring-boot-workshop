package sebivenlo.workshop.dto;

/**
 *
 * @author merve
 */
public class CourseDTO {
    
    private int id;
    private String course;
    private int credit;

    public CourseDTO() {
    }

    public CourseDTO(int id, String course, int credit) {
        this.id = id;
        this.course = course;
        this.credit = credit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
    
    
}
