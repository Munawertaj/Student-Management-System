package com.bs23.studentmanagement.service;

import com.bs23.studentmanagement.exception.StudentNotFoundException;
import com.bs23.studentmanagement.model.Student;
import com.bs23.studentmanagement.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public List<Student> findAll() {
        return repository.findAll();
    }

    public Student findById(int id) {
        return repository.findById(id)
                .orElseThrow(() -> new StudentNotFoundException("Student with ID " + id + " not found"));
    }

    public void save(Student student) {
        repository.save(student);
    }

    public void update(Student student) {
        repository.save(student);
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
