package Regestration.StudentSystem.service;
import Regestration.StudentSystem.model.Student;

import java.util.List;

public interface StudentService {

    void saveStudent(Student student);
    List<Student> getAllStudents();
}