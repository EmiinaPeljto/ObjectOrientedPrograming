package Week10.Lab.Task1;

import Week10.Lab.Task1.Annotations.UserPermission;

@UserPermission

public class User {
    private String user;

    public User(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
