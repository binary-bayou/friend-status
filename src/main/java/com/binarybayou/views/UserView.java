package com.binarybayou.views;

import javax.validation.constraints.NotNull;

/**
 * Created by Joshua Eaton on 8/15/17.
 */
public class UserView extends BaseEntityView {

    @NotNull
    private String username;

    private String firstName;

    private String lastName;

    @NotNull
    private String email;

    private String phoneNumber;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserView)) return false;
        if (!super.equals(o)) return false;

        UserView userView = (UserView) o;

        if (!username.equals(userView.username)) return false;
        if (firstName != null ? !firstName.equals(userView.firstName) : userView.firstName != null) return false;
        if (lastName != null ? !lastName.equals(userView.lastName) : userView.lastName != null) return false;
        if (!email.equals(userView.email)) return false;
        return phoneNumber != null ? phoneNumber.equals(userView.phoneNumber) : userView.phoneNumber == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + username.hashCode();
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + email.hashCode();
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        return result;
    }
}
