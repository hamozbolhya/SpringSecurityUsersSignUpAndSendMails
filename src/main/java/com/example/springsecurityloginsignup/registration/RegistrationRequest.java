package com.example.springsecurityloginsignup.registration;

import lombok.*;

@AllArgsConstructor
@EqualsAndHashCode
@Data
public class RegistrationRequest {
    private   String firstName;
    private   String lastName;
    private   String email;
    private   String password;
}
