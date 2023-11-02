package com.api.algafood.config;

import com.api.algafood.notations.TipoNotificador;
import com.api.algafood.notations.enuns.NivelNotificador;
import com.api.algafood.notificador.Notificador;
import com.api.algafood.notificador.NotificadorEmail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificacaoConfig {

    @TipoNotificador(NivelNotificador.EMAIL)
    @Bean
    public Notificador configurarNotificadorEmail() {
        NotificadorEmail notificadorEmail = new NotificadorEmail("smtp.ers.com.br");
        notificadorEmail.setCaixaAlta(false);
        return notificadorEmail;
    }
}
