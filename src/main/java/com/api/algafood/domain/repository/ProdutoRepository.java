package com.api.algafood.domain.repository;

import com.api.algafood.domain.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
