package com.camavilca.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camavilca.model.Cliente;

public interface ClienteRepositorio extends JpaRepository<Cliente, Long> {

}
