package com.api.algafood.controller;

import com.api.algafood.domain.model.Restaurante;
import com.api.algafood.domain.service.RestauranteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

}
