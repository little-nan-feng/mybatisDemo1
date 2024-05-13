package dao;

import com.nanfeng.pojo.Customer;

import java.util.List;

public interface CustomerMapper{

    List<Customer> queryCustomer(Customer customer);
    List<Customer> queryCustomer2(Customer customer);

}
