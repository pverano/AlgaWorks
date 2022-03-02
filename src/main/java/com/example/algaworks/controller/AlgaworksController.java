package com.example.algaworks.controller;

import com.example.algaworks.modelo.TB_CLIENTE;
import com.example.algaworks.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cliente")
public class AlgaworksController {

    @Autowired
    ClienteRepository clienteRepository;

    @GetMapping
    public List<TB_CLIENTE> listAll() {
        return clienteRepository.findAll();
    }

    @PostMapping
    public TB_CLIENTE save(@RequestBody TB_CLIENTE cliente) {
        return clienteRepository.save(cliente);
    }
}
