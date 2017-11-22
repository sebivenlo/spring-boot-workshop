package sebivenlo.workshop.controller;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sebivenlo.workshop.dto.AccountDTO;
import sebivenlo.workshop.dto.StudentDTO;
import sebivenlo.workshop.service.AccountService;

/**
 * Controller for accessing Account data.
 *
 * @author merve
 */
@Controller
@RequestMapping(value = "/account")
public class AccountController {

    //TODO 1.5.0: initialize this field using dependency injection
    private AccountService accountService;

    /**
     * Loads the index.html file when this method is triggered.
     *
     * @param model Model provided by the Template Engine
     * @return HTML file
     */
    //TODO 1.5.1: put annotation for Http request
    public String index(Model model) {
        model.addAttribute("account", new AccountDTO());
        return "index";
    }

    /**
     * Logs the user in.
     *
     * @param mail Email
     * @param password Password
     * @return home.html if user exists otherwise index.html
     */
    //TODO 1.5.2 put annotation HINT: argument needs to be annotated as well
    public String login(@Valid @ModelAttribute AccountDTO account, Model model) {
        if (accountService.hasUser(account.getMail(), account.getPassword())) {
            
            //TODO 2.4.0: retrieve students from the StudentService
            model.addAttribute("students", getStudents());
            
            return "home";
        } else {
            return "index";
        }
    }

    /**
     * Test Data
     * @return 
     */
    private List<StudentDTO> getStudents() {
        List<StudentDTO> students = new ArrayList<>();
        students.add(new StudentDTO(1, "Micheal", "Scott", 2014, true, 7, "Bachelor of Science", "Software Engineering"));
        students.add(new StudentDTO(2, "Christopher", "McCain", 2017, true, 3, "Bachelor of Science", "Logistics"));
        students.add(new StudentDTO(3, "John", "Miller", 2016, true, 1, "Bachelor of Engineering", "Mechanics"));
        students.add(new StudentDTO(4, "Bill", "Smith", 2010, true, 8, "Bachelor of Business Administration", "International Business and Management"));
        students.add(new StudentDTO(5, "John", "Doe", 2010, true, 8, "Bachelor of Business Administration", "International Business and Management"));

        return students;
    }
    

}
