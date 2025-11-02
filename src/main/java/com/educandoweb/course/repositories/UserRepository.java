package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User;

//Repositório da entidade User, responsável por operações relacionadas aos usuários do sistema.
//Herda todos os métodos padrão do JpaRepository.
//Essa camada é a ponte entre o banco de dados e os serviços (service layer).
public interface UserRepository extends JpaRepository<User, Long> {

}
