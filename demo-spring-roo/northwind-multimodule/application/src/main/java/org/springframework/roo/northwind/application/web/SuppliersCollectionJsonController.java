package org.springframework.roo.northwind.application.web;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;
import org.springframework.roo.northwind.model.Supplier;

/**
 * = SuppliersCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Supplier.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class SuppliersCollectionJsonController {
}
