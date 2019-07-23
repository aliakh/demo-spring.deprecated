package org.springframework.roo.northwind.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import org.springframework.roo.northwind.model.PurchaseOrder;

/**
 * = PurchaseOrderRepositoryImpl
 *
 * Implementation of PurchaseOrderRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = PurchaseOrderRepositoryCustom.class)
public class PurchaseOrderRepositoryImpl extends QueryDslRepositorySupportExt<PurchaseOrder> implements PurchaseOrderRepositoryCustom{

    /**
     * Default constructor
     */
    PurchaseOrderRepositoryImpl() {
        super(PurchaseOrder.class);
    }
}