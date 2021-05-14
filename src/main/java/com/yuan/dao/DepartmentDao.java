package com.yuan.dao;

import com.yuan.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//部门Dao
@Repository
public class DepartmentDao {
    //模拟数据库中的数据

    private static Map<Integer, Department>department=null;
    static{
        department=new HashMap<Integer, Department>();
        department.put(101,new Department(101,"教学部"));
        department.put(102,new Department(102,"市场部"));
        department.put(103,new Department(103,"教研部"));
        department.put(104,new Department(104,"运营部"));
        department.put(105,new Department(105,"后勤部"));

    }


    public Collection<Department> getDepartment(){
        return department.values();
    }

    public Department getDepartmentById(Integer id){
        return department.get(id);
    }
}
