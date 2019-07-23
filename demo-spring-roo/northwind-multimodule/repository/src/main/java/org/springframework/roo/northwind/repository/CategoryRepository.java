package org.springframework.roo.northwind.repository;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;
import org.springframework.roo.northwind.model.Category;

/**
 * = CategoryRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Category.class)
public interface CategoryRepository extends DetachableJpaRepository<Category, Long>, CategoryRepositoryCustom {
}
