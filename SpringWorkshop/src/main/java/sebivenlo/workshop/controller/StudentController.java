package sebivenlo.workshop.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import sebivenlo.workshop.dto.CourseDTO;
import sebivenlo.workshop.dto.StudentDTO;

/**
 *
 * @author merve
 */
//TODO 2.2.0: implement the Student Controller and underlying Service & Repository
@Service
public class StudentController {
    
    //TODO 2.2.1: retrieve Student by it's id and pass it to the model
    public String view(@PathVariable("id")int id, Model model) {
        
        //TODO 2.2.2: retrieve Student by id and courses that are taken in the current semester of the student
        StudentDTO stud = null;
        List<CourseDTO> courses = null;
        model.addAttribute("student", stud);
        model.addAttribute("courses", courses);

        return "view";
    }
    
    //TODO 2.2.3: retrieve Student by it's id and pass it to the model
    public String edit(@PathVariable("id")int id, Model model){

        //TODO 2.2.4: retrieve Student by id and courses that are taken in the current semester of the student
        StudentDTO stud = null;
        List<CourseDTO> courses = null;
        model.addAttribute("student", stud);
        model.addAttribute("courses", courses);
        return "edit";
    }
    
    //TODO 2.2.5: put annotations 
    // HINT: content type is used with 'consumes'
    public void save(@RequestBody StudentDTO student ){
        //TODO 2.2.6: update student in the database
    }
    
}
