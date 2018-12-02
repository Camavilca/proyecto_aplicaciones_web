package com.camavilca.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.camavilca.model.Reserva;

public interface ReservaRepositorio extends JpaRepository<Reserva, Long> {

}
