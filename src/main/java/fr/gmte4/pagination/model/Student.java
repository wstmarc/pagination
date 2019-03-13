package fr.gmte4.pagination.model;

import lombok.Data;

import javax.persistence.*;

//TEST PAGINATION
@Data
@Entity
@Table(name="tbl_student")
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY) ////auto increment
    private long id;
    private String name;
    private String branch;
    private int percentage;
    private int phone;
    private String email;
}