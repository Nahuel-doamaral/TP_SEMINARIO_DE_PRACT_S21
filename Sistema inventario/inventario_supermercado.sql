CREATE DATABASE inventario_supermercado;

USE inventario_supermercado;

CREATE TABLE productos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    categoria VARCHAR(50),
    cantidad INT DEFAULT 0,
    fecha_caducidad DATE
);
