package com.supermercado;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductoDAO productoDAO = new ProductoDAO();

        // Crear un nuevo producto
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date fechaCaducidad = sdf.parse("2023-12-31");
            Producto producto = new Producto("Leche", "Lácteos", 50, fechaCaducidad);
            productoDAO.agregarProducto(producto);
        } catch (ParseException e) {
            System.out.println("Error al parsear la fecha: " + e.getMessage());
        }

        // Listar todos los productos
        List<Producto> productos = productoDAO.listarProductos();
        System.out.println("Lista de productos:");
        for (Producto p : productos) {
            System.out.println("ID: " + p.getId() + ", Nombre: " + p.getNombre() +
                    ", Categoría: " + p.getCategoria() + ", Cantidad: " + p.getCantidad() +
                    ", Fecha de Caducidad: " + p.getFechaCaducidad());
        }
    }
}