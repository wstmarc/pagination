package fr.gmte4.pagination.api;


import fr.gmte4.pagination.model.Student;
import fr.gmte4.pagination.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.data.domain.Pageable;

//TEST PAGINATION
//  /studentsApi/queryByPage?page=0&size=3
@RestController
@RequestMapping("/studentsApi")
public class StudentPageRestController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/queryByPage", method = RequestMethod.GET)
    public Page<Student> queryByPage(Pageable pageable) {
        Page<Student> pageInfo = studentService.listByPage(pageable);
        return pageInfo;
    }
}