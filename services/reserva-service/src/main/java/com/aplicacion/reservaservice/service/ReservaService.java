package com.aplicacion.reservaservice.service;

import com.aplicacion.reservaservice.model.Reserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aplicacion.reservaservice.repository.IReservaRepository;
import com.aplicacion.reservaservice.service.impl.IReservaService;

import java.util.List;
@Service
public class ReservaService implements IReservaService {

    @Autowired
    IReservaRepository reservaReporistory;

    @Override
    public Reserva crearReserva(Reserva reserva) {
        return reservaReporistory.save(reserva);
    }

    @Override
    public Reserva actualizarReserva(Reserva reserva) {
        Reserva re = buscarReservaPorId(reserva.getReservaId());
        if (re!= null){
            return reservaReporistory.save(reserva);
        }
        return null;
    }

    @Override
    public Reserva buscarReservaPorId(Long reservaId) {
        return reservaReporistory.findById(reservaId).orElse(null);
    }

    @Override
    public List<Reserva> listaReservas() {
        return reservaReporistory.findAll();
    }
}


