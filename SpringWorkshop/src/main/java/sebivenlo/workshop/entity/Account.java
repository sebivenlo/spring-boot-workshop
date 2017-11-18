package sebivenlo.workshop.entity;

/**
 * Account Entity corresponding to Account Table in Database.
 *
 * @author merve
 */
//TODO 1.2.0: put annotations here
public class Account {

    //TODO 1.2.1: put annotations here
    private int id;

    //TODO 1.2.3: put annotations here
    private String mail;

    //TODO 1.2.4: put annotations here
    private String password;

    //TODO 1.2.5: define field/annotations for user_role foreign key AND generate getter/setter
    // private ?? userRole;
    
    public Account() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
}
