package com.api.algafood.controller;

import com.api.algafood.domain.model.Cozinha;
import com.api.algafood.domain.service.CozinhaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cozinhas")
@RequiredArgsConstructor
public class CozinhaController {

    private final CozinhaService cozinhaService;

    @GetMapping
    public ResponseEntity<List<Cozinha>> getAll() {
        return new ResponseEntity<>(cozinhaService.getAll(), HttpStatus.OK);
    }
}
