package org.example;

public class User {
    private String password;

    public String getPassword() {
        String maskedPassword = "";
        for (int i = 0; i < password.length(); i++){
            maskedPassword = maskedPassword.concat("*");
        }
        return maskedPassword;
    }

    public void setPassword(String password) {
        if (password.length() >= 8) {
            this.password = password;
            System.out.println("Successfully set password.");
        } else {
            System.out.println("Error: Password must be at least 8 characters long.");
        }
    }
}
