package com.example.demo.Author.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Author.model.Author;
@Service
public class AuthorServiceImpl implements iAuthorService {
	
	@Autowired
	iAuthorRepository AuthorRepository;
	
    @Override 
	public Integer saveAuthor(Author author) {
		Author saveAuthor = AuthorRepository.save(author);
		return saveAuthor.getId();
	}




}
