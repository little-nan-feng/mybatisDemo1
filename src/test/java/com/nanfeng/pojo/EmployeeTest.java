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
import java.util.List;

public class EmployeeTest {

    //SqlSession sqlSession= MyBatisUtils.getSession();

    SqlSession sqlSession=null;

    @Before
    public void setUp() throws Exception{

        Reader reader= null;
        reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
        sqlSession=sqlSessionFactory.openSession();
    }

    @Test
    public void findById(){

        //查询测试
        Employee employee=sqlSession.selectOne("com.nanfeng.pojo.Employee.findById",3);
        System.out.println(employee);
/*        EmployeeMapper mapper=sqlSession.getMapper(EmployeeMapper.class);
        mapper.findById(1);*/

        //查询所有
/*        List<Employee> employees= sqlSession.selectList("com.nanfeng.pojo.Employee.findAll",3);
        for (Employee employee:employees){
            System.out.println(employee);
        }*/

        sqlSession.close();
    }

/*    @Test
    public void addEmployee(){

        //插入测试
        Employee employee=new Employee();
        employee.setId(5);
        employee.setName("钱六");
        employee.setAge(22);
        employee.setPosition("员工");

        sqlSession.insert("com.nanfeng.pojo.Employee.addEmployee",employee);
        //EmployeeMapper.addEmployee(employee);

        //手动提交事务
        sqlSession.commit();
        sqlSession.close();
    }*/

/*    @Test
    public void updateEmployee(){

        //更新测试
        Employee employee=new Employee();
        employee.setId(4);
        employee.setName("钱六");
        employee.setAge(22);
        employee.setPosition("厨师");

        sqlSession.update("com.nanfeng.pojo.Employee.updateEmployee",employee);
        //EmployeeMapper.updateEmployee(employee);

        sqlSession.commit();
        sqlSession.close();
    }*/

    @Test
    public void deleteEmployee(){

        //删除测试
        sqlSession.delete("com.nanfeng.pojo.Employee.deleteEmployee",4);
        //EmployeeMapper.deleteEmployee(5);

        sqlSession.commit();
        sqlSession.close();
    }
}
