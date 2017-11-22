/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sebivenlo.workshop.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author merve
 */
@Entity
@Table(name = "user_student")
@NamedQueries({
    @NamedQuery(name = "UserStudent.findAll", query = "SELECT u FROM UserStudent u")})
public class UserStudent implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 20)
    @Column(name = "name")
    private String name;
    @Size(max = 20)
    @Column(name = "surname")
    private String surname;
    @Column(name = "full_time")
    private Boolean fullTime;
    @Column(name = "enrol_year")
    private Integer enrolYear;
    @Column(name = "semester")
    private Integer semester;
    @JoinColumn(name = "account_id", referencedColumnName = "id")
    @ManyToOne
    private Account accountId;
    @JoinColumn(name = "degree_id", referencedColumnName = "id")
    @ManyToOne
    private Degree degreeId;
    @JoinColumn(name = "study_prog_id", referencedColumnName = "id")
    @ManyToOne
    private StudyProgram studyProgId;

    public UserStudent() {
    }

    public UserStudent(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Boolean getFullTime() {
        return fullTime;
    }

    public void setFullTime(Boolean fullTime) {
        this.fullTime = fullTime;
    }

    public Integer getEnrolYear() {
        return enrolYear;
    }

    public void setEnrolYear(Integer enrolYear) {
        this.enrolYear = enrolYear;
    }

    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public Account getAccountId() {
        return accountId;
    }

    public void setAccountId(Account accountId) {
        this.accountId = accountId;
    }

    public Degree getDegreeId() {
        return degreeId;
    }

    public void setDegreeId(Degree degreeId) {
        this.degreeId = degreeId;
    }

    public StudyProgram getStudyProgId() {
        return studyProgId;
    }

    public void setStudyProgId(StudyProgram studyProgId) {
        this.studyProgId = studyProgId;
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
        if (!(object instanceof UserStudent)) {
            return false;
        }
        UserStudent other = (UserStudent) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sebivenlo.workshop.entity.UserStudent[ id=" + id + " ]";
    }
    
}
