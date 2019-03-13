package fr.gmte4.pagination.service;

import fr.gmte4.pagination.dao.StudentPageRepository;
import fr.gmte4.pagination.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Pageable;

//TEST PAGINATION
@Service
public class StudentService {
    @Autowired
    private StudentPageRepository studentPageRepository;

    public Page<Student> listByPage(Pageable pageable) {
        return studentPageRepository.findAll(pageable);
    }
}