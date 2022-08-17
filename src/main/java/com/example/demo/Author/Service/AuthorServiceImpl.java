package com.example.demo.Author.Service;

import java.util.List;
import java.util.Optional;

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

	@Override
	public List<Author> getAllAuthor() {
		
		return AuthorRepository.findAll();
	}

	@Override
	public Optional<Author> getById(Integer id) {
		// TODO Auto-generated method stub
		return AuthorRepository.findById(id);
	}




}
