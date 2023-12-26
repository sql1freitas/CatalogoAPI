package com.matheus.catalogo.DTO;

import com.matheus.catalogo.Entity.Itens;
import org.hibernate.annotations.Comment;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Assemble {
    public ItensDTO itensToDTO(Itens itens){

          ItensDTO itensDTO = new ItensDTO();
          itensDTO.setId(itens.getId());
          itensDTO.setTitle(itens.getTitle());
          itensDTO.setImage(itens.getImage());
          itensDTO.setValue(itens.getValue());


        return itensDTO;
    }
}
