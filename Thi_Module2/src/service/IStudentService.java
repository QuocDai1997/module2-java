package service;

import product.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();

    void add(Student newStudent);

    List<Student> update(Student newStudent);

    Student findById(int id);

    boolean exist(int id);

    boolean existByName(String name);

    boolean existsById(int id);

    void deleteById(int id);

    List<Student> findAllOrderByAverageScoreASC();

    List<Student> findAllOrderByAverageScoreDESC();
}
