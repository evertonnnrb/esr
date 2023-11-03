package com.api.algafood.events;

import com.api.algafood.model.Cliente;

public class ClienteAtivadoEvent {

    private Cliente cliente;

    public ClienteAtivadoEvent(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
