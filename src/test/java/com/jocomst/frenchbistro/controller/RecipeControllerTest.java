package com.jocomst.frenchbistro.controller;

import com.jocomst.frenchbistro.service.RecipeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(RecipeController.class)
public class RecipeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private RecipeService recipeService;

    @Test
    public void testShowRecipes() throws Exception {
        // Assume that findAllRecipes returns an empty list or a predefined list
        // Mockito.when(recipeService.findAllRecipes()).thenReturn(...);

        mockMvc.perform(get("/"))
               .andExpect(status().isOk())
               .andExpect(view().name("recipes"))
               // Further assertions, e.g., model attributes
               ;
    }

    // Additional tests for other methods in RecipeController
    @Test
    public void testGetRecipeById() throws Exception {
        // Arrange
        Long recipeId = 1L;
        Recipe mockRecipe = new Recipe(); // Set up your Recipe object as needed
        mockRecipe.setId(recipeId);
        // ... set other properties of the Recipe object ...

        Mockito.when(recipeService.findById(recipeId)).thenReturn(mockRecipe);

        // Act & Assert
        mockMvc.perform(get("/recipes/{id}", recipeId))
               .andExpect(status().isOk())
               .andExpect(view().name("recipeDetails"))
               .andExpect(model().attributeExists("recipe"))
               .andExpect(model().attribute("recipe", mockRecipe));
    }

}

