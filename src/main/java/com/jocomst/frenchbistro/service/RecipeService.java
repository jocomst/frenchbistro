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
        try {
            return recipeRepository.findAll();
        } catch (Exception e) {
            // Log the exception here if you wish
            return new ArrayList<>(); // Return an empty list if there's an exception
        }
    }

    // Additional business logic methods

}

