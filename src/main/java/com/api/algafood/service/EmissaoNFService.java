package com.api.algafood.service;

import com.api.algafood.notificador.Notificador;
import com.api.algafood.domain.model.Usuario;
import com.api.algafood.domain.model.Produto;
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

    public void emitirNF(Usuario cliente, Produto produto) {
        System.out.println("Emitindo NF do produto " + produto.getDescricao());
        notificador.notificarCliente(cliente, "Notificando  " + cliente.getEmail());
    }
}
