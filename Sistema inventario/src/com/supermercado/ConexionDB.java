package com.supermercado;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    // URL de conexión a la base de datos
    private static final String URL = "jdbc:mysql://localhost:3306/inventario_supermercado";
    // Usuario y contraseña de MySQL
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    // Método para obtener una conexión a la base de datos
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}