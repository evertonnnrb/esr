package com.api.algafood.domain.service;

import com.api.algafood.domain.model.Restaurante;
import com.api.algafood.domain.repository.RestauranteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
