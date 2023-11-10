package com.api.algafood.controller;

import com.api.algafood.domain.model.Cozinha;
import com.api.algafood.domain.service.CozinhaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/cozinhas"
        , produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
@RequiredArgsConstructor
public class CozinhaController {

    private final CozinhaService cozinhaService;

    @PostMapping
    public ResponseEntity insert(@RequestBody Cozinha cozinha) {
        return new ResponseEntity<>(cozinhaService.insert(cozinha), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Cozinha>> getAll() {
        return new ResponseEntity<>(cozinhaService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cozinha> getById(@PathVariable Long id) {
        return new ResponseEntity<>(cozinhaService.getById(id), HttpStatus.OK);
    }
}
