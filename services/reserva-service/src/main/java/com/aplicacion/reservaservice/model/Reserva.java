package com.aplicacion.reservaservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "reserva")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservaId;
    private String clienteNombres;
    private String clienteApellidos;
    private int telefonoCliente;
    private String emailCliente;
    private LocalDate fechaReserva;
    private LocalTime horaReserva;
    private String estadoReserva;
    private String nombreHotel;
    private String tipoHabitacion;
    private int numeroHabitacion;
    private int numeroPersonas;
    private double precioTotal;
    private LocalDate fechaIngreso;
    private LocalDate fechaSalida;


}
