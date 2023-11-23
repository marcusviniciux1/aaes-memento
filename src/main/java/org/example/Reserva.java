package org.example;

import java.util.ArrayList;
import java.util.List;

public class Reserva {

    private EstadoReserva estado;
    private List<EstadoReserva> memento = new ArrayList<>();

    public EstadoReserva getEstado() {
        return this.estado;
    }

    public void setEstado(EstadoReserva estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<EstadoReserva> getEstados() {
        return this.memento;
    }
}