package Awesomecucus.Objects;

public class Issue {

    public Issue(String BugName) {
        this.BugName = BugName;
    }

    public String getBugName() {

        return BugName;
    }

    public void setBugName(String BugName) {

        this.BugName = BugName;
    }

    private String BugName;
}
