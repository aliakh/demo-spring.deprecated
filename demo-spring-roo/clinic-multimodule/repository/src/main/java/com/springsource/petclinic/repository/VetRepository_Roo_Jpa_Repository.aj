// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.springsource.petclinic.repository;

import com.springsource.petclinic.repository.VetRepository;
import org.springframework.transaction.annotation.Transactional;

privileged aspect VetRepository_Roo_Jpa_Repository {
    
    declare @type: VetRepository: @Transactional(readOnly = true);
    
}
