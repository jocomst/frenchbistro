package com.jocomst.frenchbistro.service;

import com.jocomst.frenchbistro.entity.Recipe;
import com.jocomst.frenchbistro.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

@Service
public class RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;

    public List<Recipe> findAllRecipes() {
        List<Recipe> recipes = recipeRepository.findAll();
        return recipes != null ? recipes : new ArrayList<>();
    }
    
    public Recipe findById(Long id) {
        return recipeRepository.findById(id).orElse(null); // or handle it differently
    }

    // Additional business logic methods
}

