package com.jocomst.frenchbistro.entity;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.List;

@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String description;

    @ElementCollection(fetch = FetchType.LAZY)
    private List<String> recipeSteps;

    @ElementCollection(fetch = FetchType.LAZY)
    private List<String> ingredients;
    
     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter for id
    public Long getId() {
        return id;
    }

    // Setter for id (optional, decide based on your business logic)
    public void setId(Long id) {
        this.id = id;
    }

    // Getters and setters for recipeSteps
    public List<String> getRecipeSteps() {
        return recipeSteps;
    }

    public void setRecipeSteps(List<String> recipeSteps) {
        this.recipeSteps = recipeSteps;
    }

    // Getters and setters for ingredients
    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }
}

