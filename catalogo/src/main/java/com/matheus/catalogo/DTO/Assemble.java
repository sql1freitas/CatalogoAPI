package com.matheus.catalogo.DTO;

import com.matheus.catalogo.Entity.Itens;
import org.hibernate.annotations.Comment;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Assemble {
    public ItensDTO itensToDTO(Itens itens){


        return new ItensDTO(itens.getId(), itens.getTitle(),itens.getImage(), itens.getValue());
    }
}
