package org.springframework.roo.northwind.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import org.springframework.roo.northwind.model.Country;

/**
 * = CountryRepositoryImpl
 *
 * Implementation of CountryRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = CountryRepositoryCustom.class)
public class CountryRepositoryImpl extends QueryDslRepositorySupportExt<Country> implements CountryRepositoryCustom{

    /**
     * Default constructor
     */
    CountryRepositoryImpl() {
        super(Country.class);
    }
}