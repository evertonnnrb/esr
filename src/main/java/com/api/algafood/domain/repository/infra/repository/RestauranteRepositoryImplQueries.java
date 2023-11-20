package com.api.algafood.domain.repository.infra.repository;

import com.api.algafood.domain.model.Restaurante;

import java.math.BigDecimal;
import java.util.List;

public interface RestauranteRepositoryImplQueries {
    public List<Restaurante> find(String nome,
                                  BigDecimal taxaFreteInicial,
                                  BigDecimal taxaFreteFinal);
}
