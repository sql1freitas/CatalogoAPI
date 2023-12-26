package com.matheus.catalogo.Controller;

import com.matheus.catalogo.Entity.Itens;
import com.matheus.catalogo.DTO.ItensDTO;
import com.matheus.catalogo.Repository.ItemRepository;
import com.matheus.catalogo.Services.ItensService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/itens")
public class ItemController {

    private ItemRepository itemRepository;

    private ItensService itensService;

    public ItemController(ItemRepository itemRepository, ItensService itensService){
        this.itensService = itensService;
        this.itemRepository = itemRepository;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Itens> getAllTest(){

        return itemRepository.findAll();

    }
    @GetMapping("/todos")
    @ResponseStatus(HttpStatus.OK)
    public List<ItensDTO> getAll(){

        return itensService.getAllItens();

    }

    @PostMapping("/save")
    public ResponseEntity<Itens> saveItem(@RequestBody Itens itens){
        Itens newItem = itensService.createItem(itens);
        return ResponseEntity.status(HttpStatus.CREATED).body(newItem);
    }
}
