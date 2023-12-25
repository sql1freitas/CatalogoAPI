package com.matheus.catalogo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("itens")
public class ItemController {
    @GetMapping
    public void getAll(){

    }
}
