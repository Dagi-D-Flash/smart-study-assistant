package GeniusGuide_System;

public abstract class User {
    private String email;
    private String fullName;
    private String password;
    private String role;
    private int userId;

    public User() {}

    public boolean login(String email, String password){
        return false;
    }

    public void logout() {}

    public void resetPassword(String email) {}
}
