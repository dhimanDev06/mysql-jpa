package mysql.jpa.com.example.controller;

import mysql.jpa.com.example.dto.StudentDTO;
import mysql.jpa.com.example.model.Address;
import mysql.jpa.com.example.model.Student;
import mysql.jpa.com.example.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/school")
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return this.schoolService.getAllStudent();
    }

    @GetMapping("/student/{id}")
    public Student getAllStudentsById(@PathVariable Long id) {
        return this.schoolService.getAllStudentId(id);
    }
    @GetMapping("/student/{id}/address")
    public List<Address> getAllAddressById(@PathVariable Long id) {
        return this.schoolService.getStudentAddress(id);
    }

}
