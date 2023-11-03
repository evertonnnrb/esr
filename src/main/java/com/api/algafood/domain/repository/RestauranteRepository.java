package com.api.algafood.domain.repository;

import com.api.algafood.domain.model.Cozinha;
import com.api.algafood.domain.model.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestauranteRepository extends JpaRepository<Restaurante, Long> {
}
