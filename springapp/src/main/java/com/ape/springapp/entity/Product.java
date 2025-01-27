package com.ape.springapp.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private Double precio;

    private Integer stock;

    public Product() {
        
    }


    public Product(Long id, String nombre, Double precio, Integer stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Getters and setters...

    public Long getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public Double getPrecio() {
        return precio;
    }
    
    public Integer getStock() {
        return stock;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    // Otros metodos...




}
