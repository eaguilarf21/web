package com.example.microserv.controller;

import com.example.microserv.entity.EntidadCliente;
import com.example.microserv.interfaz.InterfazCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Clientes")
public class ControladoraCliente {

    @Autowired
    private InterfazCliente inter;

    @GetMapping
    public List<EntidadCliente> Read()
    {
        return (List<EntidadCliente>) inter.findAll();
    }

    @PostMapping
    public void Create(@RequestBody EntidadCliente pEntidadCliente)
    {
        inter.save(pEntidadCliente);
    }

    @PutMapping
    public void Update(@RequestBody EntidadCliente pEntidadCliente)
    {
        inter.save(pEntidadCliente);
    }

    @DeleteMapping(value = "/{codigo}")
    public void Delete(@PathVariable("codigo") Integer pId)
    {
        inter.deleteById(pId);
    }
}
