package com.api.algafood.domain.model;

import com.api.algafood.domain.enuns.StatusPedido;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Pedido {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codigo;

    private BigDecimal subTotal;

    private BigDecimal taxaFrete;

    private BigDecimal valorTotal;

    private LocalDate dataCriacao;

    private LocalDate dataConfirmacao;

    private LocalDate dataEntrega;

    private LocalDate dataCancelamento;

    @Enumerated(EnumType.STRING)
    private StatusPedido statusPedid;
}
