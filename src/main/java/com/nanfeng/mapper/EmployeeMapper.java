package com.nanfeng.mapper;

import com.nanfeng.pojo.Employee;

public interface EmployeeMapper {
    //根据id查找对象
    public Employee findById(int id);

    //插入对象
    public static void addEmployee(Employee employee){};

    //更新对象信息
    public static void updateEmployee(Employee employee){};

    //删除对象
    public static void deleteEmployee(int id){};
}
