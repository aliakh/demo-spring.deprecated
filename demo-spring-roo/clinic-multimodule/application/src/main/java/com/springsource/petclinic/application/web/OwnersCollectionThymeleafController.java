package com.springsource.petclinic.application.web;
import com.springsource.petclinic.model.Owner;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = OwnersCollectionThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Owner.class, type = ControllerType.COLLECTION)
@RooThymeleaf
public class OwnersCollectionThymeleafController {
}
