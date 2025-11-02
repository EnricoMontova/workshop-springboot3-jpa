package com.educandoweb.course.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

// Marca essa entidade do JPA (Será uma tabela no banco)
@Entity
@Table(name="tb_user") // Define o nome da tabela
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L; 
	
	// Define o atributo id como chave primária
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) // Gera ids automaticamente
	private Long id;
	
	// Colunas da tabela
	private String name;
	private String email;
	private String phone;
	private String password;
	
	// Um usuários pode ter vários pedidos (1:N)
	@JsonIgnore // Evita loop infinito quando JSON tenta converter os pedidos e os usuários ao mesmo tempo
	@OneToMany(mappedBy="client") // Client é o nome do atributo que mapeia o usuário dentro da classe Order
	private List<Order> orders = new ArrayList<>();
	
	// Construtor padrão obrigatório para JPA
	public User() {
	}
	
	// Construtor com argumentos (usado para criação manual de objetos)
	public User(Long id, String name, String email, String phone, String password) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}
	
	// Getters e Setters (permitem acessar e alterar atributos)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public List<Order> getOrders() {
		return orders;
	}
	
	// Métodos para comparar objetos (Importante para JPA)
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}

} 	
