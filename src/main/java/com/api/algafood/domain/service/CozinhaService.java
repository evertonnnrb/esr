package com.api.algafood.domain.service;

import com.api.algafood.domain.model.Cozinha;
import com.api.algafood.domain.repository.CozinhaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CozinhaService {


    private final CozinhaRepository cozinhaRepository;

    @Transactional
    public Cozinha insert(Cozinha cozinha) {
        return cozinhaRepository.save(cozinha);
    }

    @Transactional
    public Cozinha update(Long id, Cozinha cozinha) {

        Cozinha cozinhaRepositoryById = cozinhaRepository.findById(id).get();
        try {
            BeanUtils.copyProperties(cozinha, cozinhaRepositoryById, "id");
            return cozinhaRepository.save(cozinhaRepositoryById);
        } catch (EmptyResultDataAccessException e) {
            e.getMessage();
        }
        return null;
    }

    @Transactional
    public void delete(Long id) {
        try {
            cozinhaRepository.delete(getById(id));
        } catch (DataIntegrityViolationException e) {
            e.getMessage();
        }
    }

    public List<Cozinha> findListByName(String nome) {
        return cozinhaRepository.findListByNome(nome);
    }

    public Optional<Cozinha> findOneByName(String nome) {
        return cozinhaRepository.findByNome(nome);
    }

    public List<Cozinha> findListByNameContaining(String name){
        return cozinhaRepository.findByNomeContaining(name);
    }

    public List<Cozinha> getAll() {
        return cozinhaRepository.findAll();
    }

    public Cozinha getById(Long id) {
        return cozinhaRepository.findById(id).get();
    }


}
