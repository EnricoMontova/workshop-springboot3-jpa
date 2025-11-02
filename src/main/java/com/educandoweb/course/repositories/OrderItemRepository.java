package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.OrderItem;
import com.educandoweb.course.entities.pk.OrderItemPK;

// Repositorio responsavel por lidar com a tabela de associacao entre Order e Product
// Usa a chave composta OrderItemPK, que representa o par (pedido, produto)
// Assim, o Spring Data JPA consegue mapear corretamente o relacionamento entre pedidos e itens.
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
