package com.rbobko.mvc.services;

import com.rbobko.mvc.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
