package com.example.demo.sampleDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.sampleDemo.model.Student;
@Repository
public interface IStudentRepository extends JpaRepository<Student,Long> {

}
