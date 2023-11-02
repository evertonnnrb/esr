package com.api.algafood.notificador;

import com.api.algafood.notations.TipoNotificador;
import com.api.algafood.notations.enuns.NivelNotificador;
import model.Cliente;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@TipoNotificador(NivelNotificador.SMS)
@Component
public class NotificadorSMS implements Notificador {


    public NotificadorSMS() {
        System.out.println("**** CONSTRUTOR NOTIFICADOR SMS CHAMADO");
    }

    @Override
    public String notificarCliente(Cliente cliente, String msg) {
        return "Notificando " + cliente.getNome() +
                " a ativação de sua conta atraves do telefone :" + cliente.getTelefone();
    }

}
