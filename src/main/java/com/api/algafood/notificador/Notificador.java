package com.api.algafood.notificador;

import com.api.algafood.model.Cliente;

public interface Notificador {

    String notificarCliente(Cliente cliente, String msg);
}
