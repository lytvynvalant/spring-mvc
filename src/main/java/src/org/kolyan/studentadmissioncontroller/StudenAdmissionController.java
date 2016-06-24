package src.org.kolyan.studentadmissioncontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class StudenAdmissionController {

    // url "http://localhost:8080/spring_mvc/addmissionForm.html"
    @RequestMapping(value = "addmissionForm.html", method = RequestMethod.GET)
    public ModelAndView getAdmissionForm() {
        ModelAndView modelAndView = new ModelAndView("AdmissionForm");
        return modelAndView;
    }

    /**
     * THIS METHOD CALLING FIRST BEFORE ANY REQUEST HANDLED METHOD
     *
     * @param model is extended instance ModelAndView in every request handler
     */
    @ModelAttribute
    public void addingCommonObjects(Model model) {
        model.addAttribute("headerMessage", "This is headerMessage using @ModelAttribute");
    }

    /**
     * @ModelAttribute -> matching data from request  field of Student
     * if field(fields) name of model 'Student' and parameter(parameters) name of query is equal
     * it(they) will be saving in in new instance 'model'
     */
    @RequestMapping(value = "submitForm.html", method = RequestMethod.POST)
    public ModelAndView submitAdmissionForm(@Valid @ModelAttribute("student1") Student student1, BindingResult result) {

        // if form not valid return new empty form
        if (result.hasErrors()) {
            return new ModelAndView("AdmissionForm");
        }

        ModelAndView modelAndView = new ModelAndView("AdmissionSucces");
        modelAndView.addObject("msg", "Details submitted by you: ");
        modelAndView.addObject("student1", student1);
        return modelAndView;
    }


}
