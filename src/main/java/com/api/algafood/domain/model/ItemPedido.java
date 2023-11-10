package com.api.algafood.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
@Entity
public class ItemPedido {

    @JsonIgnore
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer quantidade;

    @JsonProperty("preco unitario")
    private BigDecimal precoUnitario;

    @JsonProperty("preco total")
    private BigDecimal precoTotal;

    private String observacao;
}

