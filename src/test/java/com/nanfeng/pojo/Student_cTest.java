package com.nanfeng.pojo;

import com.nanfeng.MyBatisUtils;
import dao.Student_cMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Student_cTest {

    SqlSession sqlSession=null;
    Student_cMapper student_cMapper=null;
    @Before
    public void setUp(){

        sqlSession= MyBatisUtils.getSession();
        student_cMapper=sqlSession.getMapper(Student_cMapper.class);
    }

    @Test
    public void test(){

        //嵌套查询测试
        /*Student_c student_c=student_cMapper.queryStudent(1);
        System.out.println(student_c);*/

        //嵌套结果测试
        Student_c student_c=student_cMapper.queryStudent2(1);
        System.out.println(student_c);

    }

    @After
    public void after(){

        sqlSession.close();
    }

}