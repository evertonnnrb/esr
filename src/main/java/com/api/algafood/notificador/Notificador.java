package com.api.algafood.notificador;

import com.api.algafood.domain.model.Usuario;

public interface Notificador {

    String notificarCliente(Usuario cliente, String msg);
}
