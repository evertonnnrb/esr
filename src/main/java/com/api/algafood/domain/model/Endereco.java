package com.api.algafood.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
@Entity
public class Endereco {

    @JsonIgnore
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cep;

    private String lagradouro;

    private String numero;

    private String complemento;

    private String bairro;

}
