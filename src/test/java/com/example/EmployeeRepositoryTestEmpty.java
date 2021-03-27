package com.example;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeRepositoryTestEmpty implements EmployeeRepository{

    @Override
    public List<Employee> findAll () {
        return null;
    }

    @Override
    public Employee save ( Employee e ) {
        return null;
    }
}