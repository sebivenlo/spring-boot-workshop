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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "account")
@NamedQueries({
    @NamedQuery(name = "Account.findAll", query = "SELECT a FROM Account a")})
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 70)
    @Column(name = "mail")
    private String mail;
    @Size(max = 50)
    @Column(name = "password")
    private String password;
    @OneToMany(mappedBy = "accountId")
    private Set<UserAdmin> userAdminSet;
    @OneToMany(mappedBy = "accountId")
    private Set<UserStudent> userStudentSet;
    @JoinColumn(name = "role_id", referencedColumnName = "id")
    @ManyToOne
    private UserRole roleId;

    public Account() {
    }

    public Account(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<UserAdmin> getUserAdminSet() {
        return userAdminSet;
    }

    public void setUserAdminSet(Set<UserAdmin> userAdminSet) {
        this.userAdminSet = userAdminSet;
    }

    public Set<UserStudent> getUserStudentSet() {
        return userStudentSet;
    }

    public void setUserStudentSet(Set<UserStudent> userStudentSet) {
        this.userStudentSet = userStudentSet;
    }

    public UserRole getRoleId() {
        return roleId;
    }

    public void setRoleId(UserRole roleId) {
        this.roleId = roleId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }
    
}
