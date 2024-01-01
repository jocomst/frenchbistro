package com.jocomst.frenchbistro.repository;

import com.jocomst.frenchbistro.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    // Custom query methods (if needed)
}

