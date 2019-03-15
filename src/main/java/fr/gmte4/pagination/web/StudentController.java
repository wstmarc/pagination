package fr.gmte4.pagination.web;

import fr.gmte4.pagination.dao.StudentPageRepository;
import fr.gmte4.pagination.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    StudentPageRepository studentPageRepository;

    @GetMapping("/list")
    public String list(Model model){
        Pageable pageable = PageRequest.of(0 , 20);
        model.addAttribute("table", studentPageRepository.findAll(pageable));
        return "list";
    }

    @GetMapping("/test")
    public String test1(Model model){
        Pageable pageable = PageRequest.of(0 , 20);
        model.addAttribute("table", studentPageRepository.findAll(pageable));
        return "test2";
    }
}
