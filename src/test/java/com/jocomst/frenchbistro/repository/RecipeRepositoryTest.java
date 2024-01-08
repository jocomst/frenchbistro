package com.jocomst.frenchbistro.repository;

import com.jocomst.frenchbistro.entity.Recipe;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class RecipeRepositoryTest {

    @Autowired
    private RecipeRepository recipeRepository;

    // Existing test methods...

    @Test
    void testFindByName() {
        // Arrange
        Recipe recipe = new Recipe();
        recipe.setName("French Toast");
        recipeRepository.save(recipe);

        // Act
        List<Recipe> foundRecipes = recipeRepository.findByName("French Toast");

        // Assert
        assertFalse(foundRecipes.isEmpty());
        assertEquals("French Toast", foundRecipes.get(0).getName());
    }

    @Test
    void testFindByIngredientContaining() {
        // Arrange
        Recipe recipe = new Recipe();
        recipe.setIngredients(Arrays.asList("Eggs", "Bread", "Milk"));
        recipeRepository.save(recipe);

        // Act
        List<Recipe> foundRecipes = recipeRepository.findByIngredientContaining("Bread");

        // Assert
        assertFalse(foundRecipes.isEmpty());
        assertTrue(foundRecipes.get(0).getIngredients().contains("Bread"));
    }

    // Other tests...
}

