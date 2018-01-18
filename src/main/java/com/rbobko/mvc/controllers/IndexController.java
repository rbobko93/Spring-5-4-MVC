package com.rbobko.mvc.controllers;

import com.rbobko.mvc.domain.Category;
import com.rbobko.mvc.domain.UnitOfMeasure;
import com.rbobko.mvc.repositories.CategoryRepository;
import com.rbobko.mvc.repositories.UnitOfMeasureRepository;
import com.rbobko.mvc.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    @Autowired
    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping(value = {"", "/", "/index"})
    public String getIndexPage(Model model){

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
