package dao;

import com.nanfeng.pojo.Student;

import java.util.List;

public interface StudentMapper {

    Student findStudentByNameAndMajor(Student student);
    List<Student> finByList(List<Integer> list);
    List<Student> findByIdLower5();
    void insertStudent(Student student);

}
