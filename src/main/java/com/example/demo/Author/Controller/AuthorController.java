package com.example.demo.Author.Controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	

}
