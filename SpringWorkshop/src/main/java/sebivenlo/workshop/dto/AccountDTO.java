package sebivenlo.workshop.dto;

/**
 *
 * @author merve
 */
public class AccountDTO {

    private String mail;
    private String password;

    public AccountDTO() {
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
