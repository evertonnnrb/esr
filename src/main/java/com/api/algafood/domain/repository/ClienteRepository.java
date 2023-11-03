package com.api.algafood.domain.repository;

import com.api.algafood.domain.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Usuario, Long> {
}
