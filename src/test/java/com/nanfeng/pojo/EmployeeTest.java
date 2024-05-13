package com.nanfeng.pojo;

import dao.EmployeeMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class EmployeeTest {

    SqlSession sqlSession=null;
    EmployeeMapper employeeMapper=null;

    @Before//在其他方法执行前执行
    public void setUp() throws Exception{      //加载sqlSession
        Reader reader= null;
        reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
        sqlSession=sqlSessionFactory.openSession(true);//参数为true，自动提交事务

        //统一获取mapper
        employeeMapper=sqlSession.getMapper(EmployeeMapper.class);

    }

    @Test
    public void findById(){

        //查询测试
        Employee employee=employeeMapper.findById(1);
        System.out.println(employee);

    }

    @Test
    public void findAll(){

        List<Employee> list=employeeMapper.findAll();
        System.out.println(list);
    }

    @Test
    public void addEmployee(){

        //插入测试
        Employee employee=new Employee();
        employee.setName("钱六");
        employee.setAge(22);
        employee.setPosition("员工");

        employeeMapper.addEmployee(employee);

    }

    @Test
    public void updateEmployee(){

        //更新测试
        Employee employee=new Employee();
        employee.setId(6);
        employee.setName("钱六");
        employee.setAge(22);
        employee.setPosition("厨师");

        employeeMapper.updateEmployee(employee);
    }

    @Test
    public void deleteEmployee(){

        //删除测试
        employeeMapper.deleteEmployee(6);
    }

    //关闭事务
    @After
    public void after(){

        sqlSession.close();
    }
}
