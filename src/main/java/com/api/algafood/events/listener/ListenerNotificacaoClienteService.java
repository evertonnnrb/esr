package com.api.algafood.events.listener;

import com.api.algafood.events.ClienteAtivadoEvent;
import com.api.algafood.notations.TipoNotificador;
import com.api.algafood.notations.enuns.NivelNotificador;
import com.api.algafood.notificador.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerNotificacaoClienteService {

    @TipoNotificador(NivelNotificador.EMAIL)
    @Autowired
    private Notificador notificador;

    @EventListener
    public void clienteAtivadoListener(ClienteAtivadoEvent event) {
        notificador.notificarCliente(event.getCliente(),"Cliente agora está ativo");
    }

}
