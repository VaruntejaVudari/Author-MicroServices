package com.example.demo.Author.Service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Author.model.Author;


public interface iAuthorRepository extends JpaRepository<Author, Integer>{

}
