package com.gabriel.fintrack.login;

import com.gabriel.fintrack.register.RegisterModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LoginRepository extends JpaRepository<RegisterModel, Long> {

    boolean existsByEmail(String email); //verifica se existe no banco de dados
    Optional<RegisterModel> findByEmail(String email); //busca por email no banco de dados

}
