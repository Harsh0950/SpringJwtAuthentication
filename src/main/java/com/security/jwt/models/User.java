package com.security.jwt.models;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class User {
    private String userId;
    private String name;
    private String email;
}
