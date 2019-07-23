package org.springframework.roo.northwind.service.api;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;
import org.springframework.roo.northwind.model.Category;

/**
 * = CategoryService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Category.class)
public interface CategoryService extends EntityResolver<Category, Long>, ValidatorService<Category> {
}
