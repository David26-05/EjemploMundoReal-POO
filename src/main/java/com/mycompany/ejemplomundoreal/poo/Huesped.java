/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplomundoreal.poo;

/**
 *
 * @author WILLIANS
 */
/**
 * Clase que representa a un huésped del hotel.
 */
public class Huesped {
    private String nombre;
    private String cedula;
    private String email;

    // Constructor
    public Huesped(String nombre, String cedula, String email) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.email = email;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Huésped: " + nombre + " (CEDULA: " + cedula + ")";
    }
}