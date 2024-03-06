package edu.uptc.swii.libraryapp.service;

import java.util.List;

import org.springframework.stereotype.Service;
import edu.uptc.swii.libraryapp.domain.*;
import edu.uptc.swii.libraryapp.repository.BookRepository;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> searchFeatured() {
        return bookRepository.findAll();
    }

}
