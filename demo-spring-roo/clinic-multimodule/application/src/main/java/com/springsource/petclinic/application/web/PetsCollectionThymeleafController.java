package com.springsource.petclinic.application.web;
import com.springsource.petclinic.model.Pet;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = PetsCollectionThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Pet.class, type = ControllerType.COLLECTION)
@RooThymeleaf
public class PetsCollectionThymeleafController {
}
