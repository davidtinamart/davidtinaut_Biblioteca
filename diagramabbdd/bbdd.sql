
CREATE TABLE Biblioteca (
                            id BIGINT PRIMARY KEY,
                            nombre VARCHAR(255)
);


CREATE TABLE Libro (
                       id BIGINT PRIMARY KEY,
                       titulo VARCHAR(255),
                       autor VARCHAR(255),
                       biblioteca_id BIGINT,
                       FOREIGN KEY (biblioteca_id) REFERENCES Biblioteca(id)
);


CREATE TABLE Lector (
                        id BIGINT PRIMARY KEY,
                        nombre VARCHAR(255),
                        apellido VARCHAR(255),
                        dni VARCHAR(20),
                        biblioteca_id BIGINT,
                        FOREIGN KEY (biblioteca_id) REFERENCES Biblioteca(id)
);


CREATE TABLE Bibliotecario (
                               id BIGINT PRIMARY KEY,
                               nombre VARCHAR(255),
                               apellido VARCHAR(255),
                               dni VARCHAR(20),
                               zona VARCHAR(255),
                               biblioteca_id BIGINT,
                               FOREIGN KEY (biblioteca_id) REFERENCES Biblioteca(id)
);


CREATE TABLE Prestamo (
                          id BIGINT PRIMARY KEY,
                          libro_id BIGINT,
                          lector_id BIGINT,
                          fecha_prestamo DATE,
                          fecha_devolucion DATE,
                          biblioteca_id BIGINT,
                          FOREIGN KEY (libro_id) REFERENCES Libro(id),
                          FOREIGN KEY (lector_id) REFERENCES Lector(id),
                          FOREIGN KEY (biblioteca_id) REFERENCES Biblioteca(id)
);