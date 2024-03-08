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
        return bookRepository.buscarTodos();
    }

    public List<Book> searchByEditorial(int editorial) {
        return bookRepository.searchByEditorial(editorial);
    }

    public List<Book> search(String search) {
        return bookRepository.search(search);
    }

    public void save(Book book) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

}
