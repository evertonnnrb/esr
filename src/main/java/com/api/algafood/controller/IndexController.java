package com.api.algafood.controller;

import com.api.algafood.service.AtivacaoClienteService;
import com.api.algafood.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class IndexController {

    private AtivacaoClienteService clienteService;

    public IndexController(AtivacaoClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    @ResponseBody
    public String getHello() {

        Cliente cliente = new Cliente();
        cliente.setNome("Arthur");
        cliente.setTelefone("99440044");
        cliente.setEmail("arthur_nrb@gmail.com");

        clienteService.ativarCliente(cliente);

        return "Cliente ativo? " + cliente.isAtivo();
    }
}
