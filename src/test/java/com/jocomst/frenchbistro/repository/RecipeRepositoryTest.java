package com.jocomst.frenchbistro.repository;

import com.jocomst.frenchbistro.entity.Recipe;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class RecipeRepositoryTest {

    @Autowired
    private RecipeRepository recipeRepository;

    @Test
    void testSaveAndFindById() {
        // Arrange: create a new recipe
        Recipe newRecipe = new Recipe();
        // set properties of newRecipe as needed

        // Act: save the recipe
        Recipe savedRecipe = recipeRepository.save(newRecipe);

        // Assert: retrieve the recipe and verify it's the one we saved
        Recipe foundRecipe = recipeRepository.findById(savedRecipe.getId()).orElse(null);
        assertNotNull(foundRecipe);
        // additional assertions to verify the recipe's properties
    }

    // Additional test methods for update, delete, custom queries, etc.
}

