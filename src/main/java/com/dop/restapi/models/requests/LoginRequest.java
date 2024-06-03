package com.dop.restapi.models.requests;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class LoginRequest {
    private String email;
    private String password;
}
