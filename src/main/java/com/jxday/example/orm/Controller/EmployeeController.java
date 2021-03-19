package com.jxday.example.orm.Controller;

import com.jxday.example.orm.MybatisPlus.domain.Employee;
import com.jxday.example.orm.MybatisPlus.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.Schedules;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName EmployeeController
 * @create 3/19/21 10:58 AM
 * @Version 1.0.0
 */

@RequestMapping("/employee")
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @RequestMapping("/all")
    @Scheduled(cron = "5/20 * * * * ? ")
    public void getAll(){
        System.err.println("in method");
        List<Employee> all = employeeService.getAll();
        System.out.println(all);
    }
}


