package com.jxday.example.orm.MybatisPlus.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jxday.example.orm.MybatisPlus.domain.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName employeeDao
 * @create 3/18/21 5:43 PM
 * @Version 1.0.0
 */
//@Mapper
public interface EmployeeDao extends BaseMapper<Employee> {
    
}
