package com.gabriel.fintrack.User;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //Entity transforma uma classe em uma entidade no banco de dados
@Table(name = "register_user")

@AllArgsConstructor
@NoArgsConstructor
@Data //serve para reduzir codigo repetitivo (boilerplate) e tornar o codigo mais limpo e focado na logica de negocios
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(unique = true)
    @NotBlank
    private String email;

    @Column(name = "password")
    private String password;
}

