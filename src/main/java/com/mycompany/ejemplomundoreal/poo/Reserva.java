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
 * Clase que maneja la reserva de una habitación por un huésped.
 */
public class Reserva {
    private Huesped huesped;
    private Habitacion habitacion;
    private int noches;

    // Constructor
    public Reserva(Huesped huesped, Habitacion habitacion, int noches) {
        this.huesped = huesped;
        this.habitacion = habitacion;
        this.noches = noches;
        habitacion.reservar(); // Intenta reservar la habitación
    }

    // Método para calcular el costo total
    public double calcularCostoTotal() {
        return habitacion.getPrecioPorNoche() * noches;
    }

    @Override
    public String toString() {
        return "Reserva a nombre de: " + huesped.getNombre() +
               "\n" + habitacion +
               "\nNoches: " + noches +
               "\nTotal a pagar: $" + calcularCostoTotal();
    }
}
