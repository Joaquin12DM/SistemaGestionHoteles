package com.aplicacion.reservaservice.repository;


import com.aplicacion.reservaservice.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReservaRepository extends JpaRepository<Reserva,Long> {

}
