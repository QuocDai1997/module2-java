package service;

import product.Student;
import untils.CSVUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class StudentService implements IStudentService{
    public final static String path = "data/student.csv";
    private static StudentService instance;

    private StudentService(){

    }

    public static StudentService getInstance() {
        if (instance == null)
            instance = new StudentService();
        return instance;
    }
    @Override
    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        List<String> records = CSVUtils.read(path);
        for (String record : records) {
            students.add(Student.parse(record));
        }
        return students;
    }

    @Override
    public void add(Student newStudent) {
        List<Student> students = findAll();
        students.add(newStudent);
        CSVUtils.write(path, students);

    }

    @Override
    public List<Student> update(Student newStudent) {
        List<Student> students = findAll();
        for (Student student : students) {
            if (student.getIdSV() == newStudent.getIdSV()) {
                String name = newStudent.getNameSV();
                if (name != null && !name.isEmpty())
                    student.setNameSV(name);

                Integer age = newStudent.getAgeSV();
                if (age != null)
                    student.setAgeSV(age);

                String sex = newStudent.getSexSV();
                if (sex != null && sex.isEmpty())
                    student.setSexSV(sex);

                CSVUtils.write(path, students);
                break;
            }
        }
        return students;
    }

    @Override
    public Student findById(int id) {
        List<Student> studentList = findAll();
        for (Student student : studentList) {
            if (student.getIdSV() == id)
                return student;
        }
        return null;
    }

    @Override
    public boolean exist(int id) {
        return findById(id) != null;
    }

    @Override
    public boolean existByName(String name) {
        List<Student> students = findAll();
        for (Student student : students) {
            if (student.getNameSV().equals(name))
                return true;
        }
        return false;
    }

    @Override
    public boolean existsById(int id) {
        List<Student> students = findAll();
        for (Student student : students) {
            if (student.getIdSV() == id)
                return true;
        }
        return false;
    }

    @Override
    public void deleteById(int id) {
        List<Student> student = findAll();

        student.removeIf(new Predicate<Student>() {
            @Override
            public boolean test(Student student) {
                return student.getIdSV() == id;
            }
        });
        CSVUtils.write(path, student);

    }

    @Override
    public List<Student> findAllOrderByAverageScoreASC() {
        List<Student> students = new ArrayList<>(findAll());
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                double result = o1.getAverageScoreSV() - o2.getAverageScoreSV();
                if (result == 0)
                    return 0;
                return result > 0 ? 1 : -1;
            }
        });
        return students;
    }

    @Override
    public List<Student> findAllOrderByAverageScoreDESC() {
        List<Student> students = new ArrayList<>(findAll());
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                double result = o2.getAverageScoreSV() - o1.getAverageScoreSV();
                if (result == 0)
                    return 0;
                return result > 0 ? 1 : -1;
            }
        });
        return students;
    }
}
