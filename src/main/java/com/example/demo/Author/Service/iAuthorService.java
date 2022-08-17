package com.example.demo.Author.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Author.model.Author;

public interface iAuthorService {
	Integer saveAuthor(Author author);
	public List<Author> getAllAuthor();
	Optional<Author>getById(Integer id);
}
