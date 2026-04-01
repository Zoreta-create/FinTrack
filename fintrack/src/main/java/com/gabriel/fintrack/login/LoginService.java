package com.gabriel.fintrack.login;

import com.gabriel.fintrack.login.dto.LoginDTO;
import com.gabriel.fintrack.register.RegisterModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class LoginService {
    @Autowired
    private LoginRepository loginRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    //LOGIN
    public RegisterModel login (LoginDTO dto) {
        RegisterModel user = loginRepository.findByEmail(dto.getEmail())
                .orElseThrow(() -> new RuntimeException("E-mail não encontrado.");
        if (!passwordEncoder.matches(dto.getPassword(), user.getPassword())) {
            throw new RuntimeException("Senha incorreta");
        }
        return user;
    }
}
