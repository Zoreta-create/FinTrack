package com.gabriel.fintrack.Register;

import com.gabriel.fintrack.Register.DTO.RegisterDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    //ENDPOINT CADASTRO - requisição com o front-end
    @PostMapping("/signup")
    public ResponseEntity<?> register (@RequestBody RegisterDTO dto) {
        try {
            RegisterModel registerUser = registerService.register(dto);
            return ResponseEntity.ok(Map.of("mensagem", "Usuário cadastrado com sucesso."));
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }
}
