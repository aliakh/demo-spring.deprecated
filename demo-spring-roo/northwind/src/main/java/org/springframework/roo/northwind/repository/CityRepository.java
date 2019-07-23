package org.springframework.roo.northwind.repository;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;
import org.springframework.roo.northwind.domain.City;
import org.springframework.roo.addon.layers.repository.jpa.annotations.finder.RooFinder;

/**
 * = CityRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = City.class, finders = { @RooFinder(value = "findByRegionIdOrderByDescriptionAsc", returnType = City.class) })
public interface CityRepository extends DetachableJpaRepository<City, Long>, CityRepositoryCustom {
}
