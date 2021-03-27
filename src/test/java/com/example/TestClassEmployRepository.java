package com.example;

import java.util.List;

public class TestClassEmployRepository implements EmployeeRepository {
    @Override
    public List<Employee> findAll () {
        return List.of (new Employee ("1",30000),
                new Employee ("2", 35000));
    }

    @Override
    public Employee save ( Employee e ) {
        return e;
    }
}
