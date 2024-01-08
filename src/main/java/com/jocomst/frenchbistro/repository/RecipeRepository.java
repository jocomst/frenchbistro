package com.jocomst.frenchbistro.repository;

import com.jocomst.frenchbistro.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    List<Recipe> findByName(String name);

    @Query("SELECT r FROM Recipe r JOIN r.ingredients i WHERE i LIKE %:ingredient%")
    List<Recipe> findByIngredientContaining(String ingredient);
}

