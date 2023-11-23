package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaTest {

    @Test
    void deveArmazenarEstados() {
        Reserva reserva = new Reserva();
        reserva.setEstado(EstadoReservaPendente.getInstance());
        reserva.setEstado(EstadoReservaConfirmada.getInstance());
        assertEquals(2, reserva.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Reserva reserva = new Reserva();
        reserva.setEstado(EstadoReservaPendente.getInstance());
        reserva.setEstado(EstadoReservaCancelada.getInstance());
        reserva.restauraEstado(0);
        assertEquals(EstadoReservaPendente.getInstance(), reserva.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Reserva reserva = new Reserva();
        reserva.setEstado(EstadoReservaPendente.getInstance());
        reserva.setEstado(EstadoReservaConfirmada.getInstance());
        reserva.setEstado(EstadoReservaPendente.getInstance());
        reserva.setEstado(EstadoReservaCancelada.getInstance());
        reserva.restauraEstado(2);
        assertEquals(EstadoReservaPendente.getInstance(), reserva.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Reserva reserva = new Reserva();
            reserva.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }
    
}