package com.jxday.example.orm.MybatisPlus.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName Employee
 * @create 3/18/21 5:35 PM
 * @Version 1.0.0
 */
@Data
@TableName(value = "employee")
public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int id;
    private String name;
    private Integer salary;
    private Integer departmentId;



}
