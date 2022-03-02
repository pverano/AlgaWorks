package com.example.algaworks.modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Table;

@Getter
@Setter
@Table(name = "TB_CLIENTE")
public class Cliente {
    private String name;
    private Integer idade;
}
