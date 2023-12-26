package com.matheus.catalogo.DTO;

import com.matheus.catalogo.Entity.Itens;

public class ItensDTO {

    private Long id;
    private String title;
    private String image;
    private Double value;




    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
