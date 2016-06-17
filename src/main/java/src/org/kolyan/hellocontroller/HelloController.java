package src.org.kolyan.hellocontroller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Spring MVC controller must extends 'AbstractController.class'
public class HelloController extends AbstractController {
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // modelAndView -> define page
        ModelAndView modelAndView = new ModelAndView("HelloPage");
        modelAndView.addObject("welcomeMessage", "He User, welcome to the first Spring MVC Application");
        return modelAndView;
    }
}