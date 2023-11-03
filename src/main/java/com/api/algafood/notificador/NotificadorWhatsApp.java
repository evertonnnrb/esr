package com.api.algafood.notificador;

import com.api.algafood.notations.TipoNotificador;
import com.api.algafood.notations.enuns.NivelNotificador;
import com.api.algafood.model.Cliente;
import org.springframework.stereotype.Component;


@TipoNotificador(NivelNotificador.WHATSAPP)
@Component
public class NotificadorWhatsApp implements Notificador {
    @Override
    public String notificarCliente(Cliente cliente, String msg) {
        return "Notificando " + cliente.getNome() +
                " a ativação de sua conta\n mandando um whatsap para :" + cliente.getTelefone();
    }

}
