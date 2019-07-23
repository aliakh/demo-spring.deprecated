package com.springsource.petclinic.application.web;
import com.springsource.petclinic.model.Vet;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = VetsItemVisitsThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Vet.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "visits")
@RooThymeleaf
public class VetsItemVisitsThymeleafController {
}
