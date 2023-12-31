package com.api.algafood.domain.service;

import com.api.algafood.domain.model.Cidade;
import com.api.algafood.domain.repository.CidadeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CidadeService {

    private final CidadeRepository cidadeRepository;

    public List<Cidade> getAll() {
        return cidadeRepository.findAll();
    }

    public Cidade insert(Cidade cidade) {
        return cidadeRepository.save(cidade);
    }

    public Cidade getOne(Long id) {
        return cidadeRepository.findById(id).get();
    }
}
