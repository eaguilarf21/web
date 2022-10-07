package com.example.microserv.interfaz;

import com.example.microserv.entity.EntidadCliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterfazCliente extends CrudRepository<EntidadCliente, Integer> {
}
