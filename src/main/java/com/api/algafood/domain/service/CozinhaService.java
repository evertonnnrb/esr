package com.api.algafood.domain.service;

import com.api.algafood.domain.model.Cozinha;
import com.api.algafood.domain.repository.CozinhaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CozinhaService {

    private final CozinhaRepository cozinhaRepository;


    public List<Cozinha> getAll() {
        return cozinhaRepository.findAll();
    }
}
