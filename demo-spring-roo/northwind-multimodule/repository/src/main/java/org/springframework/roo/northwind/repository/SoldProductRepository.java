package org.springframework.roo.northwind.repository;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;
import org.springframework.roo.northwind.model.SoldProduct;

/**
 * = SoldProductRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = SoldProduct.class)
public interface SoldProductRepository extends DetachableJpaRepository<SoldProduct, Long>, SoldProductRepositoryCustom {
}
