package com.gabriel.fintrack.register.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data //serve para reduzir codigo repetitivo (boilerplate) e tornar o codigo mais limpo e focado na logica de negocios
public class RegisterDTO {
    private String name;
    private String email;
    private String password;
    private String confirmPassword;
    private String goal;
    private String income;
    private String expense;
    private String tips;
    private String darkMode;
}
