package org.springframework.roo.northwind.service.api;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;
import org.springframework.roo.northwind.model.Product;

/**
 * = ProductService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Product.class)
public interface ProductService extends EntityResolver<Product, Long>, ValidatorService<Product> {
}
