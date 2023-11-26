package io.bootify.bibliotecatinaut;

import io.bootify.bibliotecatinaut.rest.LectorResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class BibliotecatinautApplication {


    public static void main(final String[] args) {
        final Logger logger = LoggerFactory.getLogger(LectorResource.class);
        SpringApplication.run(BibliotecatinautApplication.class, args);
        logger.info("APLICACION INICIADA");

    }

}
