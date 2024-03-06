package edu.uptc.swii.libraryapp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.uptc.swii.libraryapp.domain.Book;
import edu.uptc.swii.libraryapp.service.BookService;

@Controller
public class ListBookController {

    private final BookService bookService;

    public ListBookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/")
    public String showBookList(Model model) {
        List<Book> selectedbooks = bookService.searchFeatured();
        model.addAttribute("books", selectedbooks);
        return "booklist";
    }

}
