package com.supermercado;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO {
    // Método para agregar un producto a la base de datos
    public void agregarProducto(Producto producto) {
        String sql = "INSERT INTO productos (nombre, categoria, cantidad, fecha_caducidad) VALUES (?, ?, ?, ?)";
        try (Connection conn = ConexionDB.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, producto.getNombre());
            pstmt.setString(2, producto.getCategoria());
            pstmt.setInt(3, producto.getCantidad());
            pstmt.setDate(4, new java.sql.Date(producto.getFechaCaducidad().getTime()));
            pstmt.executeUpdate();
            System.out.println("Producto agregado correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al agregar el producto: " + e.getMessage());
        }
    }

    // Método para listar todos los productos de la base de datos
    public List<Producto> listarProductos() {
        List<Producto> productos = new ArrayList<>();
        String sql = "SELECT * FROM productos";
        try (Connection conn = ConexionDB.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Producto producto = new Producto(
                        rs.getString("nombre"),
                        rs.getString("categoria"),
                        rs.getInt("cantidad"),
                        rs.getDate("fecha_caducidad")
                );
                producto.setId(rs.getInt("id"));
                productos.add(producto);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar los productos: " + e.getMessage());
        }
        return productos;
    }
}