package io.bootify.bibliotecatinaut.repos;

import io.bootify.bibliotecatinaut.domain.Lector;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LectorRepository extends JpaRepository<Lector, Long> {
}
