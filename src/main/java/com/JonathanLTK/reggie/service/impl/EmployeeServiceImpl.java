package com.JonathanLTK.reggie.service.impl;

import com.JonathanLTK.reggie.entity.Employee;
import com.JonathanLTK.reggie.mapper.EmployeeMapper;
import com.JonathanLTK.reggie.service.EmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
