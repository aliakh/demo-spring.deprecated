package demo.web;
import demo.domain.Timer;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = TimersCollectionThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Timer.class, type = ControllerType.COLLECTION)
@RooThymeleaf
public class TimersCollectionThymeleafController {
}
