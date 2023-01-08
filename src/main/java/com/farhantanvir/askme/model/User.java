package com.farhantanvir.askme.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String profilePhotoUrl;
    private String country;
    private String occupation;
    private Date dateOfBirth;
    private String gender;
    private String role;

    public User(String email, String password, String firstName, String lastName) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}