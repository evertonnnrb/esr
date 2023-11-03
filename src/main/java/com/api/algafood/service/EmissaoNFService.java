package com.api.algafood.service;

import com.api.algafood.notificador.Notificador;
import com.api.algafood.model.Cliente;
import com.api.algafood.model.Produto;
import org.springframework.stereotype.Component;

@Component
public class EmissaoNFService {

    private Notificador notificador;

    public EmissaoNFService(Notificador notificador) {
        this.notificador = notificador;
    }

    public EmissaoNFService() {
        this.notificador = notificador;
    }

    public void emitirNF(Cliente cliente, Produto produto) {
        System.out.println("Emitindo NF do produto " + produto.getNome());
        notificador.notificarCliente(cliente, "Notificando  " + cliente.getEmail());
    }
}
