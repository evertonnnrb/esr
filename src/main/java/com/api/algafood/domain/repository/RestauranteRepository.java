package com.api.algafood.domain.repository;

import com.api.algafood.domain.model.Restaurante;
import com.api.algafood.domain.repository.infra.repository.RestauranteRepositoryImplQueries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface RestauranteRepository extends JpaRepository<Restaurante, Long>, RestauranteRepositoryImplQueries {

    List<Optional<Restaurante>> findByTaxaFreteBetween(BigDecimal taxaInicial, BigDecimal taxaFinal);

    //@Query("from Restaurante where nome like %:nome% and cozinha.id= :id")
    List<Optional<Restaurante>> buscarRestaurantesECozinhas(String nome,@Param("id") Long cozinhaId);


}
