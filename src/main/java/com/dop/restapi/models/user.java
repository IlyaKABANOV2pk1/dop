package com.dop.restapi.models;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class user {
private String email;
private String name;
private String password;

public user(String email, String pass){
    this.email = email;
    this.password=pass;
}

    public String getEmail() {
    return email;
    }

    public String getName() {
    return name;
    }
}
