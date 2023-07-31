package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.Category;

public class CategoryDTO {

    private long id;
    private String description;

    public CategoryDTO(long id, String description) {
        this.id = id;
        this.description = description;
    }

    public CategoryDTO(Category entity) {
        id = entity.getId();
        description = entity.getName();
    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
