package com.jocomst.frenchbistro.service;

import com.jocomst.frenchbistro.entity.Recipe;
import com.jocomst.frenchbistro.repository.RecipeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
public class RecipeServiceTest {

    @Mock
    private RecipeRepository recipeRepository;

    @InjectMocks
    private RecipeService recipeService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testFindAllRecipesReturnsData() {
        // Arrange
        List<Recipe> mockRecipes = new ArrayList<>();
        mockRecipes.add(new Recipe()); // Add mock Recipe objects as needed
        when(recipeRepository.findAll()).thenReturn(mockRecipes);

        // Act
        List<Recipe> recipes = recipeService.findAllRecipes();

        // Assert
        assertNotNull(recipes);
        assertFalse(recipes.isEmpty());
        verify(recipeRepository).findAll();
    }

    @Test
    public void testFindAllRecipesReturnsEmptyListWhenNull() {
        // Arrange
        when(recipeRepository.findAll()).thenReturn(null);

        // Act
        List<Recipe> recipes = recipeService.findAllRecipes();

        // Assert
        assertNotNull(recipes);
        assertTrue(recipes.isEmpty(), "The list should be empty if null is returned from repository");
        verify(recipeRepository).findAll();
    }

    // Additional tests for other methods in RecipeService
}

