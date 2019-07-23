package com.springsource.petclinic.application.web;
import com.springsource.petclinic.model.Visit;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = VisitsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Visit.class, type = ControllerType.ITEM)
@RooThymeleaf
public class VisitsItemThymeleafController implements ConcurrencyManager<Visit> {
}
