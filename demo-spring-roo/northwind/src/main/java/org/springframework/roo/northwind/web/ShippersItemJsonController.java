package org.springframework.roo.northwind.web;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;
import org.springframework.roo.northwind.domain.Shipper;

/**
 * = ShippersItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Shipper.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class ShippersItemJsonController {
}
