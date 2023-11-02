package com.api.algafood.notificador;

import model.Cliente;

public interface Notificador {

    String notificarCliente(Cliente cliente, String msg);
}
