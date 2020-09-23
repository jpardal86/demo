DROP TABLE IF EXISTS departamento;
DROP TABLE IF EXISTS persona;
 
CREATE TABLE persona (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  nombre VARCHAR(250) NOT NULL,
  apellidos VARCHAR(250) NOT NULL,
  edad INT DEFAULT NULL
);
 
INSERT INTO persona (nombre, apellidos, edad) VALUES
  ('Andres', 'Antunez', 34),
  ('Beatriz', 'Benitez', 22),
  ('Conrado', 'Cabello', 65);
  
CREATE TABLE departamento (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  nombre VARCHAR(250) NOT NULL,
  descripcion VARCHAR(250) NOT NULL,
  responsable INT NOT NULL
);

INSERT INTO departamento (nombre, descripcion, responsable) VALUES
  ('Dpto1.', 'Departamento 1', 1),
  ('Dpto2.', 'Departamento 2', 3);
  
