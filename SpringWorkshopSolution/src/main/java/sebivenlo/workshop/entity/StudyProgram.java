/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sebivenlo.workshop.entity;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author merve
 */
@Entity
@Table(name = "study_program")
@NamedQueries({
    @NamedQuery(name = "StudyProgram.findAll", query = "SELECT s FROM StudyProgram s")})
public class StudyProgram implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 100)
    @Column(name = "study_program")
    private String studyProgram;
    @OneToMany(mappedBy = "studyProgId")
    private Set<Course> courseSet;
    @OneToMany(mappedBy = "studyProgId")
    private Set<UserStudent> userStudentSet;

    public StudyProgram() {
    }

    public StudyProgram(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudyProgram() {
        return studyProgram;
    }

    public void setStudyProgram(String studyProgram) {
        this.studyProgram = studyProgram;
    }

    public Set<Course> getCourseSet() {
        return courseSet;
    }

    public void setCourseSet(Set<Course> courseSet) {
        this.courseSet = courseSet;
    }

    public Set<UserStudent> getUserStudentSet() {
        return userStudentSet;
    }

    public void setUserStudentSet(Set<UserStudent> userStudentSet) {
        this.userStudentSet = userStudentSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StudyProgram)) {
            return false;
        }
        StudyProgram other = (StudyProgram) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sebivenlo.workshop.entity.StudyProgram[ id=" + id + " ]";
    }
    
}
