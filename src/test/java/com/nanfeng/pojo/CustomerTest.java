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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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

        //查询
        Customer customer=new Customer();

        //有条件查询
        /*customer.setUsername("jack");
        List<Customer> list= customerMapper.queryCustomerByAge("青年");//根据类型
        System.out.println(list);*/

        //使用数组，list，map来进行符合条件的查询
        int[] arr={1,2,3};//数组
        List<Integer>list=new ArrayList<>();//list
        list.add(1);
        list.add(2);
        list.add(3);

        Map<String,List<Integer>> map=new HashMap<String,List<Integer>>();//map
        map.put("arr",list);

        List<Customer> customers=customerMapper.queryCustomerById3(map);
        System.out.println(customers);


/*
        //更新
        customer.setId(2);
        customer.setUsername("afu");
        customer.setJobs("保洁");
        customerMapper.updateCustomer(customer);
*/

        sqlSession.close();
    }

}