// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.springframework.roo.northwind.application.web;

import io.springlets.data.domain.GlobalSearch;
import java.util.Collection;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.roo.northwind.application.web.PartiesCollectionJsonController;
import org.springframework.roo.northwind.application.web.PartiesItemJsonController;
import org.springframework.roo.northwind.model.Party;
import org.springframework.roo.northwind.service.api.PartyService;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.util.UriComponents;

privileged aspect PartiesCollectionJsonController_Roo_JSON {
    
    declare @type: PartiesCollectionJsonController: @RestController;
    
    declare @type: PartiesCollectionJsonController: @RequestMapping(value = "/api/parties", name = "PartiesCollectionJsonController", produces = MediaType.APPLICATION_JSON_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private PartyService PartiesCollectionJsonController.partyService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param partyService
     */
    @Autowired
    public PartiesCollectionJsonController.new(PartyService partyService) {
        this.partyService = partyService;
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return PartyService
     */
    public PartyService PartiesCollectionJsonController.getPartyService() {
        return partyService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param partyService
     */
    public void PartiesCollectionJsonController.setPartyService(PartyService partyService) {
        this.partyService = partyService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return ResponseEntity
     */
    @GetMapping(name = "list")
    public ResponseEntity<Page<Party>> PartiesCollectionJsonController.list(GlobalSearch globalSearch, Pageable pageable) {
        
        Page<Party> parties = getPartyService().findAll(globalSearch, pageable);
        return ResponseEntity.ok(parties);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return UriComponents
     */
    public static UriComponents PartiesCollectionJsonController.listURI() {
        return MvcUriComponentsBuilder
            .fromMethodCall(
                MvcUriComponentsBuilder.on(PartiesCollectionJsonController.class).list(null, null))
            .build().encode();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param party
     * @param result
     * @return ResponseEntity
     */
    @PostMapping(name = "create")
    public ResponseEntity<?> PartiesCollectionJsonController.create(@Valid @RequestBody Party party, BindingResult result) {
        
        if (party.getId() != null || party.getVersion() != null) {        
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        Party newParty = getPartyService().save(party);
        UriComponents showURI = PartiesItemJsonController.showURI(newParty);
        
        return ResponseEntity.created(showURI.toUri()).build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param parties
     * @param result
     * @return ResponseEntity
     */
    @PostMapping(value = "/batch", name = "createBatch")
    public ResponseEntity<?> PartiesCollectionJsonController.createBatch(@Valid @RequestBody Collection<Party> parties, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        getPartyService().save(parties);
        
        return ResponseEntity.created(listURI().toUri()).build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param parties
     * @param result
     * @return ResponseEntity
     */
    @PutMapping(value = "/batch", name = "updateBatch")
    public ResponseEntity<?> PartiesCollectionJsonController.updateBatch(@Valid @RequestBody Collection<Party> parties, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        getPartyService().save(parties);
        
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return ResponseEntity
     */
    @DeleteMapping(value = "/batch/{ids}", name = "deleteBatch")
    public ResponseEntity<?> PartiesCollectionJsonController.deleteBatch(@PathVariable("ids") Collection<Long> ids) {
        
        getPartyService().delete(ids);
        
        return ResponseEntity.ok().build();
    }
    
}