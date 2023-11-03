package com.api.algafood.events;

import com.api.algafood.domain.model.Usuario;

public class ClienteAtivadoEvent {

    private Usuario cliente;

    public ClienteAtivadoEvent(Usuario cliente) {
        this.cliente = cliente;
    }

    public Usuario getCliente() {
        return cliente;
    }
}
