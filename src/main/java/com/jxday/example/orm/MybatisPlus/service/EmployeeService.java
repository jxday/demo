package com.jxday.example.orm.MybatisPlus.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jxday.example.orm.MybatisPlus.domain.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployeeService extends IService<Employee> {
    List<Employee> getAll();
}
