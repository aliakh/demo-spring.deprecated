package com.springsource.petclinic.application.web;
import com.springsource.petclinic.model.Vet;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = VetsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Vet.class, type = ControllerType.ITEM)
@RooThymeleaf
public class VetsItemThymeleafController implements ConcurrencyManager<Vet> {
}
