package org.example;

public class EstadoReservaPendente implements EstadoReserva {

    private static EstadoReservaPendente instance = new EstadoReservaPendente();

    ;
    private EstadoReservaPendente() {
    }

    public static EstadoReservaPendente getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Pendente";
    }
}