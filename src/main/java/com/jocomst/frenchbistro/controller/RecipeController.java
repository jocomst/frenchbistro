package com.jocomst.frenchbistro.controller;

import com.jocomst.frenchbistro.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    @GetMapping("/")
    public String showRecipes(Model model) {
        model.addAttribute("recipes", recipeService.findAllRecipes());
        return "recipes";
    }

    // Other endpoints as needed
    
    @GetMapping("/recipes/{id}")
public String getRecipeById(@PathVariable Long id, Model model) {
    Recipe recipe = recipeService.findById(id);
    model.addAttribute("recipe", recipe);
    return "recipeDetails"; // Assuming "recipeDetails" is the name of the Thymeleaf template
}
}

