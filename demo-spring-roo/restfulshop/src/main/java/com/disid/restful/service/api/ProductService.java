package com.disid.restful.service.api;
import com.disid.restful.model.Product;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = ProductService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Product.class)
public interface ProductService extends EntityResolver<Product, Long>, ValidatorService<Product> {
}
