package com.api.algafood.controller;

import com.api.algafood.service.AtivacaoClienteService;
import com.api.algafood.domain.model.Usuario;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/index",
        produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
public class IndexController {

    private AtivacaoClienteService clienteService;

    public IndexController(AtivacaoClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    @ResponseBody
    public String getHello() {

        Usuario cliente = new Usuario();
        cliente.setNome("Arthur");
        cliente.setTelefone("99440044");
        cliente.setEmail("arthur_nrb@gmail.com");

        clienteService.ativarCliente(cliente);

        return "Cliente ativo? " + cliente.isAtivo();
    }
}
