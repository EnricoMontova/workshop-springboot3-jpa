package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Order;

// Responsavel por acessar os dados dos Pedidos no banco
// Nenhum metodo adicional e necessario aqui, pois o JpaRepository ja oferece o basico
// Atraves desse repositorio que a camada de servico manipula pedidos
public interface OrderRepository extends JpaRepository<Order, Long> {

}
