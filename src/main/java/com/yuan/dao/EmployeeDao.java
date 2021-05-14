package com.yuan.dao;

import com.yuan.pojo.Department;
import com.yuan.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployeeDao {
    private static Map<Integer, Employee>employeeMap=null;
    @Autowired
    private DepartmentDao departmentDao;
    //模拟数据库
    static {
        employeeMap=new HashMap<Integer,Employee>();
        employeeMap.put(1001,new Employee(1001,"AA","2660763346@qq.com",1,new Department(101,"后勤部")));
        employeeMap.put(1002,new Employee(1002,"BB","26232363346@qq.com",0,new Department(102,"教学部")));
        employeeMap.put(1003,new Employee(1003,"CC","26634433346@qq.com",1,new Department(103,"市场部")));
        employeeMap.put(1004,new Employee(1004,"DD","230763346@qq.com",0,new Department(104,"科研部")));
        employeeMap.put(1005,new Employee(1005,"EE","5360763346@qq.com",1,new Department(105,"随便部")));

    }
    //主键自增
    private static Integer initId=1006;
    //增加一个员工
    public void save(Employee e){
        if(e.getId()==null){
            e.setId(initId++);
        }
        e.setDepartment(departmentDao.getDepartmentById(e.getDepartment().getId()));
        employeeMap.put(e.getId(),e);

    }
    //查询全部员工
    public Collection<Employee> getAll(){
        return employeeMap.values();
    }

    public  Employee getEmployeeById(Integer id){
        return employeeMap.get(id);
    }

    public void delete(Integer id){
        employeeMap.remove(id);
    }

}