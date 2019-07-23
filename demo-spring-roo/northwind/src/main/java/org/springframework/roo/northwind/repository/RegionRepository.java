package org.springframework.roo.northwind.repository;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;
import org.springframework.roo.northwind.domain.Region;
import org.springframework.roo.addon.layers.repository.jpa.annotations.finder.RooFinder;

/**
 * = RegionRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Region.class, finders = { @RooFinder(value = "findByCountryIdOrderByDescriptionAsc", returnType = Region.class) })
public interface RegionRepository extends DetachableJpaRepository<Region, Long>, RegionRepositoryCustom {
}
