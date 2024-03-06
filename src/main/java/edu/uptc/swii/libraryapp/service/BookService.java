package edu.uptc.swii.libraryapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import edu.uptc.swii.libraryapp.domain.*;

@Service
public class BookService {

    public List<Book> searchFeatured() {
        List<Book> featured = new ArrayList<>();
        Book bookOne = new Book();
        bookOne.setName("Fundamentals of Software Architecture: An Engineering Approach 1st Edición");
        bookOne.setDescription(
                "salary surveys worldwide regularly place software architect in the top 10 best jobs, yet no real guide exists to help developers become architects. Until now. This book provides the first comprehensive overview of software architecture’s many aspects. ");
        bookOne.setImagenUrl("https://m.media-amazon.com/images/I/9193iMIxVTL._SY466_.jpg");
        featured.add(bookOne);
        return featured;
    }

}
