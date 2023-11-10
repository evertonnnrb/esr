package com.api.algafood.domain.model;

import com.api.algafood.domain.enuns.StatusPedido;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Pedido {

    @JsonIgnore
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codigo;

    @JsonProperty("sub total")
    private BigDecimal subTotal;

    @JsonProperty("taxa de frete")
    private BigDecimal taxaFrete;

    @JsonProperty("valor total")
    private BigDecimal valorTotal;

    @JsonProperty("data pedido")
    private LocalDate dataCriacao;

    @JsonProperty("data confirmação")
    private LocalDate dataConfirmacao;

    @JsonProperty("data entrega")
    private LocalDate dataEntrega;

    @JsonProperty("data de cancelamento")
    private LocalDate dataCancelamento;

    @JsonProperty("status")
    @Enumerated(EnumType.STRING)
    private StatusPedido statusPedido;
}
