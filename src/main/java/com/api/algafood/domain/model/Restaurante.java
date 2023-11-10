package com.api.algafood.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Restaurante {

    @JsonIgnore
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private BigDecimal taxaFrete;

    @ManyToOne
    @JoinColumn(name = "cozinha_id")
    private Cozinha cozinha;

    private boolean ativo = false;

    private boolean aberto = false;

    private LocalDate dataCadastro;

    private LocalDate dataAtualizacao;

    public void ativarCozinha() {
        this.ativo = true;
    }

    public void abrirCozinha(){
        this.aberto = true;
    }
}
