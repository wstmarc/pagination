package fr.gmte4.pagination.dao;

import fr.gmte4.pagination.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;

import org.springframework.data.domain.Pageable;

//TEST PAGINATION
public interface StudentPageRepository extends PagingAndSortingRepository<Student, Long> {
    /*Page<Student> findAll(Pageable pageable);*/
}
