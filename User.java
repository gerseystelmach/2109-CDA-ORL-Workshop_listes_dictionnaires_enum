public class User {

    private String firstname;
    private String lastname;
    private TitleEnum title;

    public User(String firstname, String lastname, TitleEnum title) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.title = title;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public TitleEnum getTitle() {
        return title;
    }

    public void setTitle(TitleEnum title) {
        this.title = title;
    }
}
