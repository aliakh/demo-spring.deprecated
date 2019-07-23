package org.springframework.roo.northwind.service.api;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;
import org.springframework.roo.northwind.domain.City;

/**
 * = CityService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = City.class)
public interface CityService extends EntityResolver<City, Long>, ValidatorService<City> {
}
