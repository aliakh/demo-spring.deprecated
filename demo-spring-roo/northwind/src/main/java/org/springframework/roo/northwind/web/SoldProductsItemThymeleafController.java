package org.springframework.roo.northwind.web;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;
import org.springframework.roo.northwind.domain.SoldProduct;

/**
 * = SoldProductsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = SoldProduct.class, type = ControllerType.ITEM)
@RooThymeleaf
public class SoldProductsItemThymeleafController implements ConcurrencyManager<SoldProduct> {
}
