package com.api.algafood.notificador;

import com.api.algafood.model.Cliente;
public class NotificadorEmail implements Notificador {

    private boolean caixaAlta;
    private String servidorSMTP;

    public NotificadorEmail(String servidorSMTP) {
        this.servidorSMTP = servidorSMTP;
    }

    @Override
    public String notificarCliente(Cliente cliente, String msg) {
        msg = "Notificando " + cliente.getNome() +
                " a ativação de sua conta atravez do email :" + cliente.getNome()
                + "\nServidor SMTP : " + servidorSMTP;

        if (!caixaAlta) {
            msg.toUpperCase();
        }

        return msg;
    }

    public void setCaixaAlta(boolean caixaAlta) {
        this.caixaAlta = caixaAlta;
    }
}
