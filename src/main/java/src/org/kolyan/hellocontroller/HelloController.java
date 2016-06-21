package src.org.kolyan.hellocontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * class witch it the controller in Spring MVC must extend 'AbstractController.class'
 * or using annotation '@Controller'
 */
// define entity using annotation
@Controller
public class HelloController {
    // define mapping using annotation
    @RequestMapping("/welcome")
    protected ModelAndView hellowWorld() {
        // modelAndView -> define page
        ModelAndView modelAndView = new ModelAndView("HelloPage");
        modelAndView.addObject("welcomeMessage", "He User, welcome to the first Spring MVC Application");
        return modelAndView;
    }
}