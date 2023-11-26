package io.bootify.bibliotecatinaut.repos;

import io.bootify.bibliotecatinaut.domain.Bibliotecario;
import io.bootify.bibliotecatinaut.domain.Lector;
import io.bootify.bibliotecatinaut.domain.Libro;
import io.bootify.bibliotecatinaut.domain.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PrestamoRepository extends JpaRepository<Prestamo, Long> {

    Prestamo findFirstByLibro(Libro libro);

    Prestamo findFirstByLector(Lector lector);

    Prestamo findFirstByBibliotecario(Bibliotecario bibliotecario);

}
