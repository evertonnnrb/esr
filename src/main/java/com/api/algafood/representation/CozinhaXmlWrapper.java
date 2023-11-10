package com.api.algafood.representation;

import com.api.algafood.domain.model.Cozinha;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;
import lombok.NonNull;

import java.util.List;

@JacksonXmlRootElement(localName = "cozinhas")
@Data
public class CozinhaXmlWrapper {

    @NonNull
    private List<Cozinha> cozinhas;
}
