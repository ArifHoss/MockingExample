package com.example;

import java.util.ArrayList;
import java.util.List;

public class MemoryEmployeeRepository implements EmployeeRepository {

    private List<Employee> employees = new ArrayList<>();


    @Override
    public List<Employee> findAll () {
        employees.add (new Employee ("1",230000));
        employees.add (new Employee ("2",250000));
        employees.add (new Employee ("3",240000));

        return employees;

    }

    @Override
    public Employee save ( Employee e ) {
        employees.add (e);
        return e;
    }

}
