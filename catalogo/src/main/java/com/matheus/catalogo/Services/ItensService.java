package com.matheus.catalogo.Services;

import com.matheus.catalogo.DTO.Assemble;
import com.matheus.catalogo.DTO.ItensDTO;
import com.matheus.catalogo.Entity.Itens;
import com.matheus.catalogo.Repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItensService {

    ItemRepository itemRepository;

    Assemble assemble;

    public ItensService(ItemRepository itemRepository,Assemble assemble){
        this.assemble = assemble;
        this.itemRepository = itemRepository;
    }


    public List<ItensDTO> getAllItens() {

        List<Itens> itensList = itemRepository.findAll();

        List<ItensDTO> itensDTOList =
                itensList.stream()
                .map(item -> assemble.itensToDTO(item))
                .collect(Collectors.toList());


        return itensDTOList;

    }

    public Itens createItem(Itens itens){

        return itemRepository.save(itens);

    }

}
