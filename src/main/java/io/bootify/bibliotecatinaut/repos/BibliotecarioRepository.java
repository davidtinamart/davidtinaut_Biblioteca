package io.bootify.bibliotecatinaut.repos;

import io.bootify.bibliotecatinaut.domain.Bibliotecario;
import io.bootify.bibliotecatinaut.domain.Lector;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BibliotecarioRepository extends JpaRepository<Bibliotecario, Long> {

    Bibliotecario findFirstByLector(Lector lector);

    boolean existsByLectorId(Long id);

}
