package org.springframework.roo.northwind.repository;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;
import org.springframework.roo.northwind.domain.PurchaseOrder;

/**
 * = PurchaseOrderRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = PurchaseOrder.class)
public interface PurchaseOrderRepository extends DetachableJpaRepository<PurchaseOrder, Long>, PurchaseOrderRepositoryCustom {
}
