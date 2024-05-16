package com.nanfeng.pojo;

import com.nanfeng.MyBatisUtils;
import dao.ClassMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.nanfeng.pojo.Class;


public class ClassTest {

    SqlSession sqlSession=null;
    ClassMapper classMapper=null;
    @Before
    public void setUp(){

        sqlSession= MyBatisUtils.getSession();
        classMapper =sqlSession.getMapper(ClassMapper.class);
    }

    @Test
    public void test(){

        //嵌套查询测试
        /*Class c=classMapper.queryclass(1010);
        System.out.println(c);*/

        //嵌套结果测试
        Class c=classMapper.queryclass2(1010);
        System.out.println(c);

    }

    @After
    public void after(){

        sqlSession.close();
    }

}