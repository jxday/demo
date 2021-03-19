package com.jxday.example.demo;

import com.jxday.example.orm.MybatisPlus.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class DemoApplicationTests {
    
    @Resource
    private EmployeeService employeeService;

    @Test
    void contextLoads() {
        employeeService.getAll();
    }

}
