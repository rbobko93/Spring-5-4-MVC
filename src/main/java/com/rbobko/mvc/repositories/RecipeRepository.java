package com.rbobko.mvc.repositories;

import com.rbobko.mvc.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
