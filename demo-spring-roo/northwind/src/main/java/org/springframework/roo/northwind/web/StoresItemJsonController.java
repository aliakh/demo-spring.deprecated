package org.springframework.roo.northwind.web;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;
import org.springframework.roo.northwind.domain.Store;

/**
 * = StoresItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Store.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class StoresItemJsonController {
}
