package src.org.kolyan.hellocontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * class witch is the controller in Spring MVC must extend 'AbstractController.class'
 * or using annotation '@Controller'
 */
@Controller
public class HelloController {
    @RequestMapping("/welcome")
    protected ModelAndView hellowWorld() {
        // modelAndView -> define page
        ModelAndView modelAndView = new ModelAndView("HelloPage");
        modelAndView.addObject("welcomeMessage", "He User, welcome to the first Spring MVC Application");

        return modelAndView;
    }
}