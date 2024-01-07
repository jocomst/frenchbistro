package com.jocomst.frenchbistro.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RecipeTest {

    private Recipe recipe;

    @BeforeEach
    public void setUp() {
        recipe = new Recipe();
    }

    @Test
    public void testIdGetterSetter() {
        Long id = 1L;
        recipe.setId(id);
        assertEquals(id, recipe.getId());
    }

    @Test
    public void testRecipeStepsGetterSetter() {
        List<String> steps = Arrays.asList("Step 1", "Step 2");
        recipe.setRecipeSteps(steps);
        assertEquals(steps, recipe.getRecipeSteps());
    }

    @Test
    public void testIngredientsGetterSetter() {
        List<String> ingredients = Arrays.asList("Ingredient 1", "Ingredient 2");
        recipe.setIngredients(ingredients);
        assertEquals(ingredients, recipe.getIngredients());
    }

    // Tests for other getters and setters
}

