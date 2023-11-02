package com.api.algafood.config;

import com.api.algafood.service.AtivacaoClienteService;
import model.Cliente;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AtivacaoClienteConfig {


    //@Bean
    public AtivacaoClienteService ativarClienteService(Cliente cliente, ApplicationEventPublisher event) {
        AtivacaoClienteService clienteService = new AtivacaoClienteService();
        //clienteService.ativarCliente(cliente, event);
        return new AtivacaoClienteService();
    }

}
