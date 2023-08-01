package Awesomecucus.Objects;

public class Credentials {

    public Credentials(String UserName) {
        this.UserName = UserName;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    private  String UserName;
}
