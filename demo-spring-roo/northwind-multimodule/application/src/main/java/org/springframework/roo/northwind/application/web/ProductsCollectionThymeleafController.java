package org.springframework.roo.northwind.application.web;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;
import org.springframework.roo.northwind.model.Product;

/**
 * = ProductsCollectionThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Product.class, type = ControllerType.COLLECTION)
@RooThymeleaf
public class ProductsCollectionThymeleafController {
}
