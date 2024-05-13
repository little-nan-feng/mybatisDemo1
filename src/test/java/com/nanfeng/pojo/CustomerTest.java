package com.nanfeng.pojo;

import dao.CustomerMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;



public class CustomerTest {

    public static final Logger logger=Logger.getLogger(CustomerTest.class);
    SqlSession sqlSession=null;

    @Before//在其他方法执行前执行
    public void setUp(){//加载sqlSession

        Reader reader= null;
        try {
            reader = Resources.getResourceAsReader("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
        sqlSession=sqlSessionFactory.openSession(true);
    }

    @Test
    public void test(){
        CustomerMapper customerMapper=sqlSession.getMapper(CustomerMapper.class);

        Customer customer=new Customer();
        customer.setUsername("jack");
        List<Customer> list= customerMapper.queryCustomer2(customer);
        //Logger.info("结果："+list);
        System.out.println(list);

        sqlSession.close();
    }

}