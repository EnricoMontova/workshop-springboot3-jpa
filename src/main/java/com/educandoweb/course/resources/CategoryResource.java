package com.educandoweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.services.CategoryService;

@RestController // Indica que esta classe é um controlador REST (responde requisições HTTP)
@RequestMapping(value="/categories") // Define o caminho base do endpoint (ex: localhost:8080/categories)
public class CategoryResource {
	
	@Autowired
	private CategoryService service; // Injeta o serviço que lida com a lógica da entidade Category
	
	// Endpoint para buscar todas as categorias (GET /categories)
	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		List<Category> list = service.findAll();
		
		// Retorna a resposta HTTP 200 (OK) com o corpo contendo a lista de categorias
		return ResponseEntity.ok().body(list);
	}

	// Endpoint para buscar uma categoria específica pelo ID (GET /categories/{id})
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id) {
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
