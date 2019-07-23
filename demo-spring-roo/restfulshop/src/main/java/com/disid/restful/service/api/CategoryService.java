package com.disid.restful.service.api;
import com.disid.restful.model.Category;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = CategoryService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Category.class)
public interface CategoryService extends EntityResolver<Category, Long>, ValidatorService<Category> {
}
