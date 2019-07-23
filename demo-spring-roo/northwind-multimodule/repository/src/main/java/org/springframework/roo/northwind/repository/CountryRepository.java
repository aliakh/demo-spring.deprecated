package org.springframework.roo.northwind.repository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;
import org.springframework.roo.northwind.model.Country;

/**
 * = CountryRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Country.class)
public interface CountryRepository extends ReadOnlyRepository<Country, Long>, CountryRepositoryCustom {
}
