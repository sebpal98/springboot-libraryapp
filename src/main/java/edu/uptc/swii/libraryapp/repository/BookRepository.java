package edu.uptc.swii.libraryapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import edu.uptc.swii.libraryapp.domain.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    @Query("from book b order by b.name")
    List<Book> buscarTodos();

    @Query("from book b where b.editorial.id = ?1 order by b.nombre")
    List<Book> searchByEditorial(int editorial);

    @Query("fron book b where b.name like %?1%")
    List<Book> search(String consult);

}
