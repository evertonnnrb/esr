package com.api.algafood.props;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "notificador.email")
public class NotificadorProperties {

    private String hostServidor;
    private Integer portServidor;

    public Integer getPortServidor() {
        return portServidor;
    }

    public String getHostServidor() {
        return hostServidor;
    }

    public void setHostServidor(String hostServidor) {
        this.hostServidor = hostServidor;
    }
}
