package com.api.algafood.domain.service;

import com.api.algafood.domain.model.Restaurante;
import com.api.algafood.domain.repository.RestauranteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RestauranteService {

    private final RestauranteRepository restauranteRepository;

    public List<Restaurante> getAll() {
        return restauranteRepository.findAll();
    }

    public Restaurante getById(Long id) {
        return restauranteRepository.findById(id).orElseThrow();
    }

    public List<Optional<Restaurante>> pesquisaFrete(BigDecimal taxaInicial, BigDecimal taxaFinal) {
        return restauranteRepository.findByTaxaFreteBetween(taxaInicial, taxaFinal);
    }

    public List<Optional<Restaurante>> findRestaurantesECozinhas(String nome, Long cozinhaId){
        return restauranteRepository.buscarRestaurantesECozinhas(nome,cozinhaId);
    }
}
