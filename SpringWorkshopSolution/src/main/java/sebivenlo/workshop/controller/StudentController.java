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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import sebivenlo.workshop.dto.CourseDTO;
import sebivenlo.workshop.dto.StudentDTO;

/**
 *
 * @author merve
 */
//TODO 2.2.0: implement the Student Controller and underlying Service & Repository
@Service
@RequestMapping("/student")
public class StudentController {
    
    //TODO 2.2.1: retrieve Student by it's id and pass it to the model
    @GetMapping("/secured/view/{id}")
    public String view(@PathVariable("id")int id, Model model) {
        System.out.println("triggered view in server");
        StudentDTO stud = getStudents().stream().filter(s -> s.getId() == id).findAny().get();
        model.addAttribute("student", stud);
        model.addAttribute("courses", getCourses());
        return "view";
    }
    
    //TODO 2.2.2: retrieve Student by it's id and pass it to the model
    @GetMapping("/secured/edit/{id}")
    public String edit(@PathVariable("id")int id, Model model){
        System.out.println("triggered edit in server");  
        StudentDTO stud = getStudents().stream().filter(s -> s.getId() == id).findAny().get();
        model.addAttribute("student", stud);
        model.addAttribute("courses", getCourses());
        return "edit";
    }
    
    //TODO 2.2.3: update the Student in database
    @PostMapping(value="/secured/save", consumes = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseStatus(value = HttpStatus.OK)
    public void save(@RequestBody StudentDTO student ){
        
    }
    
    private List<StudentDTO> getStudents() {
        List<StudentDTO> students = new ArrayList<>();
        students.add(new StudentDTO(1, "Merve", "Sahin", 2014, true, 7, "Bachelor of Science", "Software Engineering"));
        students.add(new StudentDTO(2, "Elif", "Sahin", 2017, true, 3, "Bachelor of Science", "Logistics"));
        students.add(new StudentDTO(3, "Mazlum", "Sahin", 2016, true, 1, "Bachelor of Engineering", "Mechanics"));
        students.add(new StudentDTO(4, "Meryem", "Sahin", 2010, true, 8, "Bachelor of Business Administration", "International Business and Management"));
        students.add(new StudentDTO(5, "John", "Doe", 2010, true, 8, "Bachelor of Business Administration", "International Business and Management"));

        return students;
    }
    
    private List<CourseDTO> getCourses(){
        List<CourseDTO> list = new ArrayList<>();
        list.add(new CourseDTO(1, "Java 1", 3));
        list.add(new CourseDTO(2, "BUA", 3));
        list.add(new CourseDTO(3, "Sen 1", 4));
        list.add(new CourseDTO(4, "DBS", 5));
        list.add(new CourseDTO(5, "Com 1", 2));
        list.add(new CourseDTO(6, "PRJ 1", 10));
        return list;        
    }
    
}
