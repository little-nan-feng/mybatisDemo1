package dao;

import com.nanfeng.pojo.Employee;

import java.util.List;

public interface EmployeeMapper {

    //查询一条
    Employee findById(int id);
    //查询所有
    List<Employee> findAll();
    //增加对象
    void addEmployee(Employee employee);
    //更新对象
    void updateEmployee(Employee employee);
    //删除对象
    void deleteEmployee(int id);
}
