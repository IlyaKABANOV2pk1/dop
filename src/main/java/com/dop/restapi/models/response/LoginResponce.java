package com.dop.restapi.models.response;

import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class LoginResponce {
    private String email;
    private String password;
}
