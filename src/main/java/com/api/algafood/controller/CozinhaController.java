package com.api.algafood.controller;

import com.api.algafood.domain.model.Cozinha;
import com.api.algafood.domain.service.CozinhaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/por-nome")
    public ResponseEntity<List<Cozinha>> findListByName(@RequestParam String nome) {
        List<Cozinha> cozinhas = cozinhaService.findListByName(nome);
        return ResponseEntity.ok(cozinhas);
    }

    @GetMapping("/por")
    public ResponseEntity<Optional<Cozinha>> findOneByName(@RequestParam String nome) {
        Optional<Cozinha> cozinha = cozinhaService.findOneByName(nome);
        return ResponseEntity.ok(cozinha);
    }

    @GetMapping("/like")
    public ResponseEntity<List<Cozinha>> findListByNameContaining(@RequestParam String nome) {
        List<Cozinha> cozinhas = cozinhaService.findListByNameContaining(nome);
        return ResponseEntity.ok(cozinhas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cozinha> getById(@PathVariable Long id) {
        Cozinha cozinha = cozinhaService.getById(id);
        if (cozinha != null) {
            return ResponseEntity.ok(cozinha);
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cozinha> update(@PathVariable Long id,
                                          @RequestBody Cozinha cozinha) {

        cozinha = cozinhaService.update(id, cozinha);
        if (cozinha != null) {
            return ResponseEntity.ok(cozinha);
        }
        return ResponseEntity.notFound().build();
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Cozinha> remove(@PathVariable Long id) {
        cozinhaService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
