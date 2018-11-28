package com.camavilca.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.camavilca.model.Cliente;



public interface ClienteRepositorio extends CrudRepository<Cliente, Long> {
}
