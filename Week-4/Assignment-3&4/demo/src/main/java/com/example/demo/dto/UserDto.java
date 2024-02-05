/*
DTO(Data Transfer Object) vs DAO(Data Access Object)
DTO: Common practice in communication between the frontend and backend.
DAO: Usually Contains methods for CRUD operations.
 */
package com.example.demo;

public class UserDto {
    private String accountName;
    private String password;
    private String signInAccount;
    private String signInPassword;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSignInAccount() {
        return signInAccount;
    }

    public void setSignInAccount(String signInAccount) {
        this.signInAccount = signInAccount;
    }

    public String getSignInPassword() {
        return signInPassword;
    }

    public void setSignInPassword(String signInPassword) {
        this.signInPassword = signInPassword;
    }
}
