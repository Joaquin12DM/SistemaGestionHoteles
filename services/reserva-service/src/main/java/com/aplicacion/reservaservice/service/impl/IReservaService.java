package com.aplicacion.reservaservice.service.impl;

import com.aplicacion.reservaservice.model.Reserva;

import java.util.List;

public interface IReservaService {

    Reserva crearReserva(Reserva reserva);
    Reserva actualizarReserva(Reserva reserva);
    Reserva buscarReservaPorId(Long reservaId);


    List<Reserva> listaReservas();


}
