package com.gfunk77.login3.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotBlank(message = "You must provide a username")
    @NonNull
    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @NotBlank(message = "You must provide a valid password")
    @NonNull
    @Column(name = "password", nullable = false)
    private String password;
}
