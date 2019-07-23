package com.springsource.petclinic.application.web;
import com.springsource.petclinic.model.Vet;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = VetsCollectionThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Vet.class, type = ControllerType.COLLECTION)
@RooThymeleaf
public class VetsCollectionThymeleafController {
}
