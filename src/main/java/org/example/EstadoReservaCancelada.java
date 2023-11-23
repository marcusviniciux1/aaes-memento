package org.example;

public class EstadoReservaCancelada implements EstadoReserva {

    private static EstadoReservaCancelada instance = new EstadoReservaCancelada();

    ;
    private EstadoReservaCancelada() {
    }

    public static EstadoReservaCancelada getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Cancelada";
    }
}