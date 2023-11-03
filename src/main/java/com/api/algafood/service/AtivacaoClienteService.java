package com.api.algafood.service;

import com.api.algafood.events.ClienteAtivadoEvent;
import com.api.algafood.domain.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;


@Component
public class AtivacaoClienteService {

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    public AtivacaoClienteService() {
    }

    public void ativarCliente(Usuario cliente) {
        cliente.ativar();
        eventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));
    }
}
