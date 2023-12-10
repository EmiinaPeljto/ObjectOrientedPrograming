package Week10.Lab.Task1;

import Week10.Lab.Task1.Annotations.UserPermission;

@UserPermission(adminPermission = true)
public class Admin {
    private String admin;

    public Admin(String admin) {
        this.admin = admin;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }
}

