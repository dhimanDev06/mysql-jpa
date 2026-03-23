package mysql.jpa.com.example.repository;

import mysql.jpa.com.example.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Long> {
}
