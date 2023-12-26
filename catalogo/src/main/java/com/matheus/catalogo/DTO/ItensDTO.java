package com.matheus.catalogo.DTO;

import com.matheus.catalogo.Entity.Itens;

public class ItensDTO {

    private Long id;
    private String title;
    private String image;
    private Double value;

    public ItensDTO(Long id, String title, String image, Double value) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}