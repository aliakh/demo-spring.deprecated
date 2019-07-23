package com.springsource.petclinic.application.web;
import com.springsource.petclinic.model.Owner;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = OwnersItemPetsThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Owner.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "pets")
@RooThymeleaf
public class OwnersItemPetsThymeleafController {
}
