// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.springframework.roo.northwind.domain;

import io.springlets.format.EntityFormat;
import org.springframework.roo.northwind.domain.CountryProjection;

privileged aspect CountryProjection_Roo_DTO {
    
    declare @type: CountryProjection: @EntityFormat;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param countryId
     * @param description
     */
    public CountryProjection.new(Long countryId, String description) {
        this.countryId = countryId;
        this.description = description;
    }

}
