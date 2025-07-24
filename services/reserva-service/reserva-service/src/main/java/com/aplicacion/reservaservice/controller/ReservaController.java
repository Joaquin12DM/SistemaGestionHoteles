package com.aplicacion.reservaservice.controller;

import com.aplicacion.reservaservice.model.Reserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.aplicacion.reservaservice.service.ReservaService;

import java.util.List;

@RestController
@RequestMapping("/apiReserva")
public class ReservaController {

    @Autowired
    ReservaService reservaService;

    @PostMapping(value = "/save")
    public Reserva crearReserva(@RequestBody Reserva reserva) {
        return reservaService.crearReserva(reserva);
    }

    @PutMapping(value = "/update")
    public Reserva actualizarReserva(@RequestBody Reserva reserva) {
        return reservaService.actualizarReserva(reserva);
    }

    @GetMapping(value = "/buscar")
    public Reserva buscarReservaPorId(@RequestParam Long reservaId) {
        return reservaService.buscarReservaPorId(reservaId);
    }

    @GetMapping(value = "/reservas")
    public List<Reserva> obtenerReservas() {
        return reservaService.listaReservas();
    }


}
