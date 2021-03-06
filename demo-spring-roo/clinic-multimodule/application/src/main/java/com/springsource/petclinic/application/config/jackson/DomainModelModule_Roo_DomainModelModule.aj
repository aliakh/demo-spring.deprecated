// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.springsource.petclinic.application.config.jackson;

import com.fasterxml.jackson.databind.module.SimpleModule;
import com.springsource.petclinic.application.config.jackson.DomainModelModule;
import com.springsource.petclinic.application.web.OwnerJsonMixin;
import com.springsource.petclinic.application.web.PetJsonMixin;
import com.springsource.petclinic.application.web.VetJsonMixin;
import com.springsource.petclinic.application.web.VisitJsonMixin;
import com.springsource.petclinic.model.Owner;
import com.springsource.petclinic.model.Pet;
import com.springsource.petclinic.model.Vet;
import com.springsource.petclinic.model.Visit;
import org.springframework.boot.jackson.JsonComponent;

privileged aspect DomainModelModule_Roo_DomainModelModule {
    
    declare parents: DomainModelModule extends SimpleModule;
    
    declare @type: DomainModelModule: @JsonComponent;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     */
    public DomainModelModule.new() {
        // Mixin registration
        
        setMixInAnnotation(Owner.class, OwnerJsonMixin.class);
        setMixInAnnotation(Pet.class, PetJsonMixin.class);
        setMixInAnnotation(Vet.class, VetJsonMixin.class);
        setMixInAnnotation(Visit.class, VisitJsonMixin.class);
    }

}
