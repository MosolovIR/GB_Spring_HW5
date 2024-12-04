package gb.Spring_HW5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping
    public String getPersons(Model model) {
        model.addAttribute("persons", personService.getAllPersons());
        return "persons";
    }

    @GetMapping("/{id}")
    public String getPerson(@PathVariable Long id, Model model) {
        model.addAttribute("person", personService.getPersonById(id));
        return "personProfile";
    }
}
