/*
DTO(Data Transfer Object) vs DAO(Data Access Object)
DTO: Common practice in communication between the frontend and backend.
DAO: Usually Contains methods for CRUD operations.
 */
package com.example.demo.dto;

public class UserDto {
    private String signUpEmail;
    private String signUpPassword;
    private String signInEmail;
    private String signInPassword;

    //Getter and Setter
    public String getSignUpEmail() {
        return signUpEmail;
    }

    public void setSignUpEmail(String signUpEmail) {
        this.signUpEmail = signUpEmail;
    }

    public String getSignUpPassword() {
        return signUpPassword;
    }

    public void setSignUpPassword(String signUpPassword) {
        this.signUpPassword = signUpPassword;
    }

    public String getSignInEmail() {
        return signInEmail;
    }

    public void setSignInEmail(String signInEmail) {
        this.signInEmail = signInEmail;
    }

    public String getSignInPassword() {
        return signInPassword;
    }

    public void setSignInPassword(String signInPassword) {
        this.signInPassword = signInPassword;
    }
}
