package com.gabriel.fintrack.User;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository <UserModel, Long> {
    boolean existsByEmail(String email); //verifica se existe no banco de dados

    Optional <UserModel> findByEmail(String email); //busca por email no banco de dados
}
