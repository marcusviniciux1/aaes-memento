package org.example;

public class EstadoReservaConfirmada implements EstadoReserva {

    private static EstadoReservaConfirmada instance = new EstadoReservaConfirmada();

    ;
    private EstadoReservaConfirmada() {
    }

    public static EstadoReservaConfirmada getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Confirmada";
    }
}