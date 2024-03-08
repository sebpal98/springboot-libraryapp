package edu.uptc.swii.libraryapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.uptc.swii.libraryapp.domain.Editorial;

@Repository
public interface EditorialRepository extends JpaRepository<Editorial, Integer> {

}
