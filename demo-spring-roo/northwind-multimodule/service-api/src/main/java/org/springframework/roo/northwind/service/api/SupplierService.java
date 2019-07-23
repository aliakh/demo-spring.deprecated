package org.springframework.roo.northwind.service.api;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;
import org.springframework.roo.northwind.model.Supplier;

/**
 * = SupplierService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Supplier.class)
public interface SupplierService extends EntityResolver<Supplier, Long>, ValidatorService<Supplier> {
}
