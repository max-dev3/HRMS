package com.example.bachelorwork.auth;

import lombok.*;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Getter
public class RegistrationRequest {
    private String username;
    private String password;
    private String email;

}
