package com.nanfeng.pojo;

import com.nanfeng.MyBatisUtils;
import dao.StudentMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class StudentTest {

    SqlSession sqlSession=null;
    StudentMapper studentMapper=null;
    @Before
    public void setUp(){

        sqlSession=MyBatisUtils.getSession();
        studentMapper=sqlSession.getMapper(StudentMapper.class);
    }

    @Test
    public void find(){

/*        //先插入几条数据方便后面查询测试
        Student student2=new Student("李四","计算机","10002");
        Student student3=new Student("王五","计算机","10003");
        Student student4=new Student("钱六","计算机","10004");
        Student student5=new Student("赵七","计算机","10005");

        studentMapper.insertStudent(student2);
        studentMapper.insertStudent(student3);
        studentMapper.insertStudent(student4);
        studentMapper.insertStudent(student5);


        //多条件查询
        Student student1=new Student();
        student1.setName("张三");
        student1.setMajor("数学");
        student1.setSno("10001");

        Student student=studentMapper.findStudentByNameAndMajor(student1);
        System.out.println(student);


        //--通过list的值在数据库中查找
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        List<Student> list1= studentMapper.finByList(list);
        System.out.println(list1);
        */

        //查询 id<5 的记录
        List<Student> list2=studentMapper.findByIdLower5();
        System.out.println(list2);

    }


    @After
    public void after(){

        sqlSession.close();
    }
}