package com.example.algaworks.repository;

import com.example.algaworks.modelo.TB_CLIENTE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public  interface ClienteRepository extends JpaRepository<TB_CLIENTE,Long> {
    @Query("from TB_CLIENTE cli where cli.nome=:nome")
    Optional<List<TB_CLIENTE>> findByNome(@Param("nome") String nome);
    @Query("select cli from TB_CLIENTE cli where cli.idade=:idade")
    List<TB_CLIENTE> findByidade(@Param("idade") Integer idade);
}
