package org.springframework.roo.northwind.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import org.springframework.roo.northwind.domain.Party;

/**
 * = PartyRepositoryImpl
 *
 * Implementation of PartyRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = PartyRepositoryCustom.class)
public class PartyRepositoryImpl extends QueryDslRepositorySupportExt<Party> implements PartyRepositoryCustom{

    /**
     * Default constructor
     */
    PartyRepositoryImpl() {
        super(Party.class);
    }
}