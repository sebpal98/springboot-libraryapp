package edu.uptc.swii.libraryapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.uptc.swii.libraryapp.domain.Book;
import edu.uptc.swii.libraryapp.service.BookService;
import edu.uptc.swii.libraryapp.service.EditorialService;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookCrudController {

    private final EditorialService editorialService;
    private final BookService bookService;

    public BookCrudController(EditorialService editorialService, BookService bookService) {
        this.editorialService = editorialService;
        this.bookService = bookService;
    }

    @RequestMapping("/books/create")
    public String showForm(Model model) {
        model.addAttribute("editorials", editorialService.searchAll());
        model.addAttribute("book", new Book());
        return "formbook";
    }

    @PostMapping("/books/save")
    public String save(Book book) {
        bookService.save(book);
        return "redirect:/";
    }

}
