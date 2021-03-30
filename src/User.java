public abstract class User {
    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String password;
    private int absences;

    public User(String firstName, String lastName, String email, int absences) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.absences = absences;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAbsences() {
        return absences;
    }

    public void setAbsences(int absences) {
        this.absences += absences;
    }
    public abstract void absentDays(int absentDay);
}
