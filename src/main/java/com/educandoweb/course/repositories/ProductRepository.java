package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Product;

//Repositório que gerencia os produtos (Product).
//Permite buscar, salvar e excluir produtos no banco de dados.
//Pode futuramente conter consultas personalizadas, como buscar por categoria ou nome.
public interface ProductRepository extends JpaRepository<Product, Long> {

}
