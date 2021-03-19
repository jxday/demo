package com.jxday.example.orm.MybatisPlus.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.Query;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jxday.example.orm.MybatisPlus.dao.EmployeeDao;
import com.jxday.example.orm.MybatisPlus.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName employeeServiceImpl
 * @create 3/18/21 5:44 PM
 * @Version 1.0.0
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeDao, Employee> implements EmployeeService{
    
    @Override
    public List<Employee> getAll() {
        QueryWrapper<Employee> query = new QueryWrapper<Employee>().ne("id", 2);
        List<Employee> list = baseMapper.selectList(query);
        System.out.println(list);
        return list;
    }
}
