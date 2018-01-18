package com.rbobko.mvc.controllers;

import com.rbobko.mvc.domain.Category;
import com.rbobko.mvc.domain.UnitOfMeasure;
import com.rbobko.mvc.repositories.CategoryRepository;
import com.rbobko.mvc.repositories.UnitOfMeasureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    @Autowired
    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping(value = {"", "/", "/index"})
    public String getIndexPage(){

        Optional<Category> category = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> uom = unitOfMeasureRepository.findByDescription("Teaspoon");
        System.out.println("Category id is " + category.get().getId());
        System.out.println("UOM id is " + uom.get().getId());

        return "index";
    }
}
