package com.example.algaworks.controller;

import com.example.algaworks.modelo.TB_CLIENTE;
import com.example.algaworks.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("clientes")
public class AlgaworksController {

    @Autowired
    ClienteRepository clienteRepository;

    @GetMapping
    public List<TB_CLIENTE> listAll() {
        return clienteRepository.findAll();
    }
    @GetMapping("/{id}")
    public Optional<TB_CLIENTE> findById(@PathVariable("id") Long id) {
        return clienteRepository.findById(id);
    }
    @GetMapping("/nome/{nome}")
    public Optional<List<TB_CLIENTE>> findByNome(@PathVariable("nome") String nome) {
        return clienteRepository.findByNome(nome);
    }
    @GetMapping("/idade/{idade}")
    public List<TB_CLIENTE> findByIdade(@PathVariable("idade")Integer idade) {
        return clienteRepository.findByidade(idade);
    }

    @PostMapping
    public TB_CLIENTE save(@RequestBody TB_CLIENTE cliente) {
        return clienteRepository.save(cliente);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Long id) {
        clienteRepository.deleteById(id);
    }
}
