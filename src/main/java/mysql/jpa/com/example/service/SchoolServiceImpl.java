package mysql.jpa.com.example.service;

import mysql.jpa.com.example.dto.StudentDTO;
import mysql.jpa.com.example.model.Address;
import mysql.jpa.com.example.model.Student;
import mysql.jpa.com.example.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SchoolServiceImpl implements SchoolService{

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public List<Student> getAllStudent() {
        return studentRepo.findAll();
    }

    @Override
    public Student getAllStudentId(Long id) {
        Student stObj = studentRepo.findById(id).orElseThrow();
        return stObj;
    }

    @Override
    public List<Address> getStudentAddress(Long id) {
        Student stObj = studentRepo.findById(id).orElseThrow();
        return stObj.getAddresses();
    }
}
