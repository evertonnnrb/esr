package com.api.algafood.service;

import com.api.algafood.notificador.Notificador;
import com.api.algafood.notificador.NotificadorEmail;
import model.Cliente;
import model.Produto;
import org.springframework.stereotype.Component;

@Component
public class EmissaoNFService {

    private Notificador notificador;

    public EmissaoNFService(Notificador notificador) {
        this.notificador = notificador;
    }

    public EmissaoNFService() {
        System.out.println("*** CONSTRUTOR EMISSAON NF SERVICE");
        this.notificador = notificador;
    }

    public void emitirNF(Cliente cliente, Produto produto) {
        System.out.println("Emitindo NF do produto " + produto.getNome());
        notificador.notificarCliente(cliente, "Notificando  " + cliente.getEmail());
    }
}
