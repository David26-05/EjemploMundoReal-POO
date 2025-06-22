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
 * Clase que modela una habitación del hotel.
 */
public class Habitacion {
    private int numero;
    private String tipo; // Ej: "Individual", "Doble", "Suite"
    private double precioPorNoche;
    private boolean disponible;

    // Constructor
    public Habitacion(int numero, String tipo, double precioPorNoche) {
        this.numero = numero;
        this.tipo = tipo;
        this.precioPorNoche = precioPorNoche;
        this.disponible = true; // Por defecto, disponible al crearse
    }

    // Método para ver disponibilidad
    public boolean estaDisponible() {
        return disponible;
    }

    // Método para reservar
    public void reservar() {
        if (disponible) {
            disponible = false;
            System.out.println("Habitación " + numero + " reservada.");
        } else {
            System.out.println("Habitación " + numero + " no disponible.");
        }
    }

    // Getters
    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    @Override
    public String toString() {
        return "Habitación #" + numero + " (" + tipo + ") - $" + precioPorNoche + "/noche";
    }
}

