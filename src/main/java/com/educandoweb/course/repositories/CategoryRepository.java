package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Category;

// Interface responsavel por acessar os dados da entidade Category no banco
// O Spring Data JPA gera automaticamente as implementacoes basicas de CRUD (Create, Read, Update, Delete).
// O JpaRepository fornece metodos como save(), findAll(), findById(), deleteById(), etc.
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
