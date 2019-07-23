package org.springframework.roo.northwind.application.web;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;
import org.springframework.roo.northwind.model.Category;

/**
 * = CategoriesItemProductsThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Category.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "products")
@RooThymeleaf
public class CategoriesItemProductsThymeleafController {
}
