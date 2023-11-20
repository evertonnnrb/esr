package com.api.algafood.controller;

import com.api.algafood.domain.model.Restaurante;
import com.api.algafood.domain.service.RestauranteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "restaurantes",
        produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
@RequiredArgsConstructor
public class RestauranteController {


    private final RestauranteService restauranteService;


    @GetMapping
    public ResponseEntity<List<Restaurante>> getAll() {
        return new ResponseEntity<>(restauranteService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Restaurante> getById(@PathVariable Long id) {
        return new ResponseEntity<>(restauranteService.getById(id), HttpStatus.OK);
    }

    @GetMapping("/taxa")
    public ResponseEntity<List<Optional<Restaurante>>> getByTaxaFrete
            (@RequestParam BigDecimal taxaInicial,
             @RequestParam BigDecimal taxaFinal) {
        List<Optional<Restaurante>> list = restauranteService.pesquisaFrete(taxaInicial, taxaFinal);
        return ResponseEntity.ok(list);
    }

    @GetMapping("/buscar")
    public ResponseEntity<List<Optional<Restaurante>>> findRestaurantesWithCozinhas(
            @RequestParam String nome,
            @RequestParam Long id) {
        List<Optional<Restaurante>> restaurantesECozinhas = restauranteService.findRestaurantesECozinhas(nome, id);
        return ResponseEntity.ok(restaurantesECozinhas);
    }

}

