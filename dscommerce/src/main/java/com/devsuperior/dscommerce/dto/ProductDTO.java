package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.Product;
import javax.persistence.Column;
import javax.validation.constraints.*;

public class ProductDTO {

    private Long id;
    private String name;
    private String description;
    private Double price;
    private String imgUrl;

    public ProductDTO(Long id, String name, String description, Double price, String imgUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    public ProductDTO(Product entity) {
        id = entity.getId();
        name = entity.getName();
        description = entity.getDescription();
        price = entity.getPrice();
        imgUrl = entity.getImgUrl();
    }

    public Long getId() {
        return id;
    }

    @Size(min=3,max=80, message = "Nome precisa ter entre 3 e 80 caracteres")
    @NotBlank(message = "Campo requerido")
    public String getName() {
        return name;
    }

    @Size(min=10, message = "Descrição precisa de no minimo 10 caracteres")
    @NotBlank
    public String getDescription() {
        return description;
    }
    @Positive(message = "Não é permitido numero negativo")
    public Double getPrice() {
        return price;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
