package io.bootify.bibliotecatinaut.repos;

import io.bootify.bibliotecatinaut.domain.Libro;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LibroRepository extends JpaRepository<Libro, Long> {
}
