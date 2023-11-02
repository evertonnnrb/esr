package com.api.algafood.service;

import com.api.algafood.events.ClienteAtivadoEvent;
import model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;


@Component
public class AtivacaoClienteService {

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    public AtivacaoClienteService() {
        System.out.println("CHAMADA CONSTRUTOR ATIVAÇÃO CLIENTE SERVICE");
    }

    public void ativarCliente(Cliente cliente) {
        cliente.ativar();
        eventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));
    }
}
