package mysql.jpa.com.example.service;

import mysql.jpa.com.example.dto.StudentDTO;
import mysql.jpa.com.example.model.Address;
import mysql.jpa.com.example.model.Student;

import java.util.List;

public interface SchoolService {

    public List<Student> getAllStudent();
    public Student getAllStudentId(Long Id);
    public List<Address> getStudentAddress(Long id);
}
