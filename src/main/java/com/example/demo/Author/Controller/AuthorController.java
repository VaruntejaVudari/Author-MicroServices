package com.example.demo.Author.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Author.Service.AuthorServiceImpl;
import com.example.demo.Author.Service.iAuthorRepository;
import com.example.demo.Author.Service.iAuthorService;
import com.example.demo.Author.model.Author;

@RestController
public class AuthorController {
	
	@Autowired
	iAuthorService AuthorService;
	
	@PostMapping("/saveAuthor")
	Integer createAuthor(@RequestBody Author author) {
		Integer id = AuthorService.saveAuthor(author);
		System.out.println(id);
		return id;
	}
	
	@GetMapping("/getAll")
	public List<Author> getAuthor(){
		return AuthorService.getAllAuthor();
	}
	
	@GetMapping("/getByid/{id}")
	public Optional<Author> getAll(@PathVariable Integer id){
		Optional<Author> aut = AuthorService.getById(id);
		return aut;
		
	}
	

}
