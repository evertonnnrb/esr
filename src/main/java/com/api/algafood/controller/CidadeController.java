package com.api.algafood.controller;

import com.api.algafood.domain.model.Cidade;
import com.api.algafood.domain.service.CidadeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/cidades", produces = {MediaType.APPLICATION_JSON_VALUE,
        MediaType.APPLICATION_XML_VALUE})
@RequiredArgsConstructor
public class CidadeController {

    private final CidadeService cidadeService;

    @PostMapping
    public ResponseEntity create(@RequestBody Cidade cidade) {
        return new ResponseEntity(cidadeService.insert(cidade), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Cidade>> getAll() {
        return new ResponseEntity<>(cidadeService.getAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Cidade> getOne(@PathVariable Long id) {
        return new ResponseEntity<>(cidadeService.getOne(id), HttpStatus.OK);
    }
}
