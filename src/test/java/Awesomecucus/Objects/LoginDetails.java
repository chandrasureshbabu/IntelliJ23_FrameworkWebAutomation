package Awesomecucus.Objects;

public class LoginDetails {

    //T6
    public LoginDetails(String Username, String Password) {
        this.Username = Username;
        this.Password = Password;
    }


    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    private String Username;
    private String Password;

}
