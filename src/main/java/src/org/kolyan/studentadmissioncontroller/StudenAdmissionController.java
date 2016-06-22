package src.org.kolyan.studentadmissioncontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudenAdmissionController {

    // url "http://localhost:8080/spring_mvc/addmissionForm.html"
    @RequestMapping(value = "addmissionForm.html", method = RequestMethod.GET)
    public ModelAndView getAdmissionForm() {
        ModelAndView modelAndView = new ModelAndView("AdmissionForm");
        return modelAndView;
    }

    @RequestMapping(value = "submitForm.html", method = RequestMethod.POST)
    /**
     * @ModelAttribute -> matching data from request  field of Student
     * if field(fields) name of model 'Student' and parameter(parameters) name of query is equal
     * it(they) will be saving in in new instance 'model'
     * */
    public ModelAndView submitAdmissionForm(@ModelAttribute("student") Student student1) {
        ModelAndView modelAndView = new ModelAndView("AdmissionSucces");
        modelAndView.addObject("msg", "Details submitted by you: ");
        modelAndView.addObject("student1", student1);
        return modelAndView;
    }


}
