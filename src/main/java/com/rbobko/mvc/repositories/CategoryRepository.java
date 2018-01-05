package com.rbobko.mvc.repositories;

import com.rbobko.mvc.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
