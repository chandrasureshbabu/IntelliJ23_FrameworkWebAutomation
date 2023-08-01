package Awesomecucus.Objects;

public class BugDetails {
    //@T6  Domain object for Bug Details data
    public BugDetails(String severity, String hardware,
                      String os, String shortDesc,
                      String description) {
        this.Severity = severity;
        this.Hardware = hardware;
        this.Os = os;
        this.ShortDesc = shortDesc;
        this.Description = description;
    }

    public String getSeverity() {
        return Severity;
    }

    public void setSeverity(String severity) {
        Severity = severity;
    }

    public String getHardware() {
        return Hardware;
    }

    public void setHardware(String hardware) {
        Hardware = hardware;
    }

    public String getOs() {
        return Os;
    }

    public void setOs(String os) {
        Os = os;
    }

    public String getShortDesc() {
        return ShortDesc;
    }

    public void setShortDesc(String shortDesc) {
        ShortDesc = shortDesc;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    private String Severity;
    private String Hardware;
    private String Os;
    private String ShortDesc;
    private String Description;

}
