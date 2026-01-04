package GeniusGuide_System;

public class Admin extends User {

    private int adminId;
    private boolean loggedIn;

    public Admin() {
        this.loggedIn = false;
    }

    @Override
    public boolean login(String email, String password) {
        if (email == null || password == null) {
            return false;
        }
        loggedIn = true;
        return true;
    }

    @Override
    public void logout() {
        loggedIn = false;
    }

    public void manageMaterials() {
        if (!loggedIn) {
            throw new IllegalStateException("Admin must be logged in");
        }
    }

    public void manageQuizzes() {
        if (!loggedIn) {
            throw new IllegalStateException("Admin must be logged in");
        }
    }

    public void manageUsers() {
        if (!loggedIn) {
            throw new IllegalStateException("Admin must be logged in");
        }
    }

    @Override
    public void resetPassword(String email) {
        if (email == null) {
            throw new IllegalArgumentException("Email cannot be null");
        }
    }

    // Getters / setters for testing
    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }
}
