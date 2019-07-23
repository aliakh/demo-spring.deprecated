package org.springframework.roo.northwind.repository;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;
import org.springframework.roo.northwind.model.Supplier;

/**
 * = SupplierRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Supplier.class)
public interface SupplierRepository extends DetachableJpaRepository<Supplier, Long>, SupplierRepositoryCustom {
}
