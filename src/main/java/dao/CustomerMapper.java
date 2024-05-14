package dao;

import com.nanfeng.pojo.Customer;

import java.util.List;
import java.util.Map;

public interface CustomerMapper{

    List<Customer> queryCustomer(Customer customer);
    List<Customer> queryCustomer2(Customer customer);
    List<Customer> queryCustomerByAge(String type);
    void updateCustomer(Customer customer);

    List<Customer> queryCustomerById1(int[] arr);
    List<Customer> queryCustomerById2(List<Integer> arr);
    List<Customer> queryCustomerById3(Map<String,List<Integer>> arr);




}
