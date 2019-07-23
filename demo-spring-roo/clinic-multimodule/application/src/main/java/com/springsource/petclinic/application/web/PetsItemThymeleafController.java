package com.springsource.petclinic.application.web;
import com.springsource.petclinic.model.Pet;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = PetsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Pet.class, type = ControllerType.ITEM)
@RooThymeleaf
public class PetsItemThymeleafController implements ConcurrencyManager<Pet> {
}
