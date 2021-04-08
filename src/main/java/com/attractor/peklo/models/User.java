package com.attractor.peklo.models;

import lombok.*;

import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
@Table(name = "users")
public class User {
    private String username;
    private String email;
    private String password;
    private String role;
}
