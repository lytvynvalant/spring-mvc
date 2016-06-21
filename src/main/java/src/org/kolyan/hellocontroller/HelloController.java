package src.org.kolyan.hellocontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * class witch is the controller in Spring MVC must extend 'AbstractController.class'
 * or using annotation '@Controller'
 */
@Controller
public class HelloController {
    // {} -> in @RequestMapping means that param in brakes is variable
    // in url "http://localhost:8080/spring_mvc/welcome/ru/unknowName"
    // "ru" is variable {countryName}
    // "unknowName" is variable {userName}
    @RequestMapping("/welcome/{countryName}/{userName}")
    protected ModelAndView hellowWorld(@PathVariable Map<String, String> pathVars) {
        // modelAndView -> define page
        String country = pathVars.get("countryName");
        String name = pathVars.get("userName");
        ModelAndView modelAndView = new ModelAndView("HelloPage");
        modelAndView.addObject("userName", "Hello!  " + name);
        modelAndView.addObject("countryName", "from  " + country);

        return modelAndView;
    }
}