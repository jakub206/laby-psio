package exercise2;

public class UserAccount {
    private String login;
    private String password;
    private boolean activityStatus;

    public UserAccount(String login, String password) {
        this.login = login;
        this.password = password;
        this.activityStatus = true;
    }

    public String getLogin() {
        return login;
    }

    public boolean getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(boolean activityStatus) {
        this.activityStatus = activityStatus;
    }

    public String toString() {
        return "UserAccount{login: "+login+", password: "+password+", activityStatus: "+activityStatus+"}";
    }

}
