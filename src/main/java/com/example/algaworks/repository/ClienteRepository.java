package com.example.algaworks.repository;

import com.example.algaworks.modelo.TB_CLIENTE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<TB_CLIENTE,Long> {
}
