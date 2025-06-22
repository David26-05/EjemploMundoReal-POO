/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplomundoreal.poo;

/**
 *
 * @author WILLIANS
 */
  /**
 * Clase principal para probar el sistema de reservas.
 */
public class EjemploMundoRealPOO {
    public static void main(String[] args) {
        // Crear un huésped
        Huesped huesped1 = new Huesped("David Garcia", "1250709837", "davidgarciaa@gmail.com");

        // Crear habitaciones
        Habitacion habitacion101 = new Habitacion(101, "Doble", 120.0);
        Habitacion habitacion202 = new Habitacion(202, "Suite", 250.0);

        // Mostrar estado inicial
        System.out.println("--- Estado inicial ---");
        System.out.println(habitacion101);
        System.out.println(habitacion202);

        // Intentar reservar
        Reserva reserva1 = new Reserva(huesped1, habitacion101, 3);
        System.out.println("\n--- Detalles de la reserva ---");
        System.out.println(reserva1);

        // Intentar reservar una habitación ya ocupada
        Reserva reserva2 = new Reserva(huesped1, habitacion101, 2); // Debe fallar
    }
}
