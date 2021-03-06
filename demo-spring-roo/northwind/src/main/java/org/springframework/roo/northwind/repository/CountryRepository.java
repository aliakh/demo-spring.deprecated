package org.springframework.roo.northwind.repository;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;
import org.springframework.roo.northwind.domain.Country;

/**
 * = CountryRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Country.class)
public interface CountryRepository extends DetachableJpaRepository<Country, Long>, CountryRepositoryCustom {
}
