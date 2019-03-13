package fr.gmte4.pagination.api;


import fr.gmte4.pagination.dao.StudentPageRepository;
import fr.gmte4.pagination.model.Student;
import fr.gmte4.pagination.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


//TEST PAGINATION
//  /studentsApi/queryByPage?page=0&size=3
@RestController
@RequestMapping("/studentsApi")
public class StudentPageRestController {
    @Autowired
    private StudentService studentService;

    @Autowired//#
    private StudentPageRepository studentPageRepository;//#

    @RequestMapping(value = "/queryByPage", method = RequestMethod.GET)
    public Page<Student> queryByPage(Pageable pageable) {
        Page<Student> pageInfo = studentService.listByPage(pageable);
        return pageInfo;
    }

/*    @GetMapping("/list")
    public String list(Model model){
        int pageSize = 10;
        Pageable pageable = PageRequest.of(0,pageSize);
        Page<Student> All = studentPageRepository.findAll(pageable);
        model.addAttribute("page", All.getTotalPages());
        model.addAttribute("size", All.get());
        return "list";
    }

    @RequestMapping(value="/test", method=RequestMethod.GET)
    public String test(){
        return "test";
    }*/
}