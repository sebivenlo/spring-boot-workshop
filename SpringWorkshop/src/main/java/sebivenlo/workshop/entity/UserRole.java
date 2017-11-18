package sebivenlo.workshop.entity;

/**
 * UserRole Entity corresponding to User_Role Table in Database.
 * 
 * @author merve
 */
//TODO 1.1.0: put annotations here
public class UserRole {
    
    // TODO 1.1.2: put annotations
    private int id;
    
    // TODO 1.1.3: put annotations
    private String role;

    public UserRole() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
