package com.gabriel.fintrack.register;

import com.gabriel.fintrack.register.dto.RegisterDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class RegisterService {

    @Autowired
    private RegisterRepository registerRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    //Cadastro
    public RegisterModel register(RegisterDTO dto) {
        if (registerRepository.existsByEmail(dto.getEmail())) {
            throw new RuntimeException("E-amil já cadastrado.");
        }
        if (!Objects.equals(dto.getPassword(), dto.getConfirmPassword())){
            throw new RuntimeException("As senhas não coincidem");
        }
        RegisterModel registerUser = new RegisterModel();
        registerUser.setName(dto.getName());
        registerUser.setEmail(dto.getEmail());
        registerUser.setGoal(dto.getGoal());
        registerUser.setIncome(dto.getIncome());
        registerUser.setExpense(dto.getExpense());
        registerUser.setTips(dto.getTips());
        registerUser.setDarkMode(dto.getDarkMode());

        // 🔐 Criptografando a senha antes de salvar
        registerUser.setPassword(passwordEncoder.encode(dto.getPassword()));

        return registerRepository.save(registerUser);
    }
}
