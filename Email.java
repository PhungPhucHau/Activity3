package activity3;

public class Email {
    private String fisrtName;
    private String lastName;
    private String depart;
    private String email;
    
    public Email() {
    }
    
    public Email(String fisrtName, String lastName, String depart) {
        this.fisrtName = fisrtName;
        this.lastName = lastName;
        this.depart = depart;
        this.email = fisrtName + "." + lastName + "@" + depart + ".hus.com";
    }

    public String getFisrtName() {
        return fisrtName;
    }

    public void setFisrtName(String fisrtName) {
        this.fisrtName = fisrtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
