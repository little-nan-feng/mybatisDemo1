package com.nanfeng.pojo;

import com.nanfeng.mapper.EmployeeMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;

public class EmployeeTest {

    //SqlSession sqlSession= MyBatisUtils.getSession();

    SqlSession sqlSession=null;

    @Before
    public void setUp(){

        Reader reader= null;
        try {
            reader = Resources.getResourceAsReader("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
        sqlSession=sqlSessionFactory.openSession();
    }

/*    @Test
    public void findById(){

        //查询测试
        Employee employee=sqlSession.selectOne("com.nanfeng.pojo.Employee.findById",3);
        System.out.println(employee);

        sqlSession.close();
    }*/

    @Test
    public void addEmployee(){

        //插入测试
        Employee employee=new Employee();
        employee.setId(4);
        employee.setName("钱六");
        employee.setAge(22);
        employee.setPosition("员工");

        EmployeeMapper.addEmployee(employee);

        //手动提交事务
        sqlSession.commit();
        sqlSession.close();
    }

/*    @Test
    public void updateEmployeeTest(){

        //更新测试
        Employee employee=new Employee();
        employee.setId(1);
        employee.setName("钱六");
        employee.setAge(22);
        EmployeeMapper.updateEmployee(employee);

        sqlSession.commit();
        sqlSession.close();
    }*/

/*    @Test
    public void deleteEmployee(){

        //删除测试
        EmployeeMapper.deleteEmployee(1);

        sqlSession.commit();
        sqlSession.close();
    }*/
}
