package com.jocomst.frenchbistro.service;

import com.jocomst.frenchbistro.entity.Recipe;
import com.jocomst.frenchbistro.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;

    public List<Recipe> findAllRecipes() {
        return recipeRepository.findAll();
    }

    // Additional business logic methods
}

