DROP TABLE IF EXISTS Ejemplo;

CREATE TABLE Ejemplo(
  nombre varchar(50) NOT NULL, 
  fec_registro Date NOT NULL, 
  cursor  varchar(50) NOT NULL, 
  codigo  varchar(50) NOT NULL, 
  mensaje  varchar(50) NOT NULL
);

INSERT INTO Ejemplo(nombre, fec_registro,cursor,codigo,mensaje) VALUES ('jonathan', 2024-04-04,'node','123','nada');
INSERT INTO Ejemplo(nombre, fec_registro,cursor,codigo,mensaje)  VALUES ('karen', 2024-04-04,'node','123','nada');
INSERT INTO Ejemplo(nombre, fec_registro,cursor,codigo,mensaje)  VALUES ('israel',2024-04-04,'node','123','nada');
INSERT INTO Ejemplo(nombre, fec_registro,cursor,codigo,mensaje)  VALUES ('ivana', 2024-04-04,'node','123','nada');

DROP PROCEDURE IF EXISTS sp_ejemplo$$

CREATE PROCEDURE sp_ejemplo(IN nombre VARCHAR(50), IN fec_registro DATE, OUT cursor  VARCHAR(50), OUT codigo  VARCHAR(50), OUT mensaje  VARCHAR(50))
BEGIN 
    SELECT cursor,codigo ,mensaje   FROM Ejemplo WHERE fec_registro >= fec_registro AND nombre=nombre;
END