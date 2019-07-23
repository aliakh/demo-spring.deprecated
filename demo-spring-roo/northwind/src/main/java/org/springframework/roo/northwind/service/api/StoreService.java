package org.springframework.roo.northwind.service.api;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;
import org.springframework.roo.northwind.domain.Store;

/**
 * = StoreService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Store.class)
public interface StoreService extends EntityResolver<Store, Long>, ValidatorService<Store> {
}
