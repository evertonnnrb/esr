package com.api.algafood.notificador;

import com.api.algafood.notations.TipoNotificador;
import com.api.algafood.notations.enuns.NivelNotificador;
import model.Cliente;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@TipoNotificador(NivelNotificador.WHATSAPP)
@Component
public class NotificadorWhatsApp implements Notificador {


    public NotificadorWhatsApp() {
        System.out.println("**** CONSTRUTOR NOTIFICADOR WHATSAPP CHAMADO");
    }

    @Override
    public String notificarCliente(Cliente cliente, String msg) {
        return "Notificando " + cliente.getNome() +
                " a ativação de sua conta\n mandando um whatsap para :" + cliente.getTelefone();
    }

}
