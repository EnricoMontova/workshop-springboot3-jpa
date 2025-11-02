package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.repositories.CategoryRepository;

@Service // Define que essa classe é um componente de serviço do Spring (gerenciado pelo Spring Container)
public class CategoryService {
	
	@Autowired // Injeta automaticamente uma instância do CategoryRepository (injeção de dependência)
	private CategoryRepository repository;
	
	// Retorna todas as categorias salvas no banco de dados
	public List<Category> findAll() {
		return repository.findAll();
	}
	
	// Busca uma categoria específica pelo ID
	public Category findById(Long id) {
		// O método .get() retorna o objeto dentro do Optional (se existir)
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
