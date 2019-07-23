package org.springframework.roo.northwind.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import org.springframework.roo.northwind.model.Region;

/**
 * = RegionRepositoryImpl
 *
 * Implementation of RegionRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = RegionRepositoryCustom.class)
public class RegionRepositoryImpl extends QueryDslRepositorySupportExt<Region> implements RegionRepositoryCustom{

    /**
     * Default constructor
     */
    RegionRepositoryImpl() {
        super(Region.class);
    }
}