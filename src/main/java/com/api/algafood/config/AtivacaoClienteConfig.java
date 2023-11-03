package com.api.algafood.config;

import com.api.algafood.service.AtivacaoClienteService;
import com.api.algafood.domain.model.Usuario;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AtivacaoClienteConfig {


    //@Bean
    public AtivacaoClienteService ativarClienteService(Usuario cliente, ApplicationEventPublisher event) {
        AtivacaoClienteService clienteService = new AtivacaoClienteService();
        //clienteService.ativarCliente(cliente, event);
        return new AtivacaoClienteService();
    }

}
