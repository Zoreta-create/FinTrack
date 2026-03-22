package com.gabriel.fintrack.User.DTO;

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
}
