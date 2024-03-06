package edu.uptc.swii.libraryapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.uptc.swii.libraryapp.domain.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
