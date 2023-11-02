package com.api.algafood.di;

import com.api.algafood.notificador.Notificador;
import com.api.algafood.notificador.NotificadorEmail;
import com.api.algafood.notificador.NotificadorSMS;
import com.api.algafood.service.AtivacaoClienteService;
import com.api.algafood.service.EmissaoNFService;
import model.Cliente;
import model.Produto;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Everton");
        cliente.setEmail("everton.nrb@gmail.com");
        cliente.setTelefone("3344-3003");

        Produto produto = new Produto();
        produto.setNome("IPHONE 15");
        produto.setValor(new BigDecimal(150000));

        Notificador notificador = new NotificadorSMS();

        AtivacaoClienteService clienteService = new AtivacaoClienteService();
        //clienteService.ativarCliente(cliente);

        EmissaoNFService emissaoNFService = new EmissaoNFService(notificador);
        emissaoNFService.emitirNF(cliente, produto);

    }
}
