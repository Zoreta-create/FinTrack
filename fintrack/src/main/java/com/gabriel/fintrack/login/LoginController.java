package com.gabriel.fintrack.login;

import com.gabriel.fintrack.login.dto.LoginDTO;
import com.gabriel.fintrack.register.RegisterModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
public class LoginController {

    @Autowired
    private LoginService loginService;

    //ENDPOINT LOGIN
    @PostMapping("/login")
    public ResponseEntity<?> login (@RequestBody LoginDTO dto) {
        try {
            RegisterModel loginUser = loginService.login(dto);
            return ResponseEntity.ok("Login realizado com sucesso!");
        } catch (Exception e) {
            return ResponseEntity.status(401).body(e.getMessage());
        }
    }

}
