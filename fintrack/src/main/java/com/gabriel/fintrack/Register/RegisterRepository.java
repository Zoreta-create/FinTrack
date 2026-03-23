package com.gabriel.fintrack.Register;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RegisterRepository extends JpaRepository <RegisterModel, Long> {
    boolean existsByEmail(String email); //verifica se existe no banco de dados

    Optional <RegisterModel> findByEmail(String email); //busca por email no banco de dados
}
