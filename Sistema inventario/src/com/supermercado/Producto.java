package com.supermercado;

import java.util.Date;

public class Producto {
    private int id;
    private String nombre;
    private String categoria;
    private int cantidad;
    private Date fechaCaducidad;

    // Constructor
    public Producto(String nombre, String categoria, int cantidad, Date fechaCaducidad) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.fechaCaducidad = fechaCaducidad;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
}