package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	// Busca todos os usuários cadastrados
	public List<User> findAll() {
		return repository.findAll();
	}
	
	// Busca um usuário pelo ID
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
	// Insere (salva) um novo usuário no banco
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	// Deleta um usuário com base no ID
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	// Atualiza os dados de um usuário já existente
	public User update(Long id, User obj) {
		// O getReferenceById busca uma referência do objeto, sem precisar ir ao banco ainda
		User entity  = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
	}
	
	// Método auxiliar usado para atualizar apenas os campos necessários
	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
