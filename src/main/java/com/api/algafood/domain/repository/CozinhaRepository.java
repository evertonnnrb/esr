package com.api.algafood.domain.repository;

import com.api.algafood.domain.model.Cozinha;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CozinhaRepository extends JpaRepository<Cozinha, Long> {

    List<Cozinha> findListByNome(String nome);
    List<Cozinha> findByNomeContaining(String nome);
    Optional<Cozinha> findByNome(String nome);
}
