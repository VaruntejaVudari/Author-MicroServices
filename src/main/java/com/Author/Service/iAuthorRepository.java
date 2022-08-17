package com.Author.Service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Author.model.Books;

public interface iAuthorRepository extends JpaRepository<Books, Integer>{

}
