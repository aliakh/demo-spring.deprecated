// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.springsource.petclinic.model;

import static org.assertj.core.api.Assertions.assertThat;

import com.springsource.petclinic.model.Vet;
import com.springsource.petclinic.model.VetTest;
import com.springsource.petclinic.model.Visit;
import com.springsource.petclinic.model.dod.VetFactory;
import com.springsource.petclinic.model.dod.VisitFactory;
import java.util.Arrays;
import java.util.Collections;
import org.junit.Test;

privileged aspect VetTest_Roo_JpaUnitTest {
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private VetFactory VetTest.vetFactory = new VetFactory();
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private VisitFactory VetTest.visitFactory = new VisitFactory();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return VetFactory
     */
    public VetFactory VetTest.getVetFactory() {
        return vetFactory;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param vetFactory
     */
    public void VetTest.setVetFactory(VetFactory vetFactory) {
        this.vetFactory = vetFactory;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return VisitFactory
     */
    public VisitFactory VetTest.getVisitFactory() {
        return visitFactory;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param visitFactory
     */
    public void VetTest.setVisitFactory(VisitFactory visitFactory) {
        this.visitFactory = visitFactory;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @throws Exception
     */
    @Test
    public void VetTest.addToVisitsShouldAddTheVisitToThevisitsRelationship() throws Exception {
        // Setup
        Vet vet = getVetFactory().create(0);
        Visit visit1 = getVisitFactory().create(0);
        Visit visit2 = getVisitFactory().create(1);
        
        // Exercise
        vet.addToVisits(Arrays.asList(visit1, visit2));
        
        // Verify
        assertThat(vet.getVisits()).as("Check 'addToVisits' adds the visits to the relationship")
            .contains(visit1).contains(visit2);
        assertThat(vet).as("Check 'addToVisits' updates the Visit relationship side")
            .isEqualTo(visit1.getVet()).isEqualTo(visit2.getVet());
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @throws Exception
     */
    @Test
    public void VetTest.addToVisitsShouldRemoveTheVisitFromThevisitsRelationship() throws Exception {
        // Setup
        Vet vet = getVetFactory().create(0);
        Visit visit1 = getVisitFactory().create(0);
        Visit visit2 = getVisitFactory().create(1);
        vet.addToVisits(Arrays.asList(visit1, visit2));
        
        // Exercise
        vet.removeFromVisits(Collections.singleton(visit1));
        
        // Verify
        assertThat(visit1.getVet()).as("Check 'removeFromVisits' updates the Visit relationship side")
            .isNull();
        assertThat(vet.getVisits()).as("Check 'removeFromVisits' removes a Visit from the relationship")
            .doesNotContain(visit1).contains(visit2);
    }
    
}
