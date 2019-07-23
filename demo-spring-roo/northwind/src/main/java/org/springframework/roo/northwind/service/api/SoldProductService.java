package org.springframework.roo.northwind.service.api;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;
import org.springframework.roo.northwind.domain.SoldProduct;

/**
 * = SoldProductService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = SoldProduct.class)
public interface SoldProductService extends EntityResolver<SoldProduct, Long>, ValidatorService<SoldProduct> {
}
