package com.api.algafood.notations;

import com.api.algafood.notations.enuns.NivelNotificador;
import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface TipoNotificador {

    NivelNotificador value();
}
