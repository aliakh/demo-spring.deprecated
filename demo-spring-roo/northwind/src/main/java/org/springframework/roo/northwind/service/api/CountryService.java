package org.springframework.roo.northwind.service.api;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;
import org.springframework.roo.northwind.domain.Country;

/**
 * = CountryService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Country.class)
public interface CountryService extends EntityResolver<Country, Long>, ValidatorService<Country> {
}
