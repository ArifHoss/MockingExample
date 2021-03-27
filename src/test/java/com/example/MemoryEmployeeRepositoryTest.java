package com.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MemoryEmployeeRepositoryTest {

    @Test
    void saveToMemory () {

        MemoryEmployeeRepository memoryEmployeeRepository = new MemoryEmployeeRepository ();

        var actual = memoryEmployeeRepository.save (new Employee ("4" , 30000));

        assertThat(memoryEmployeeRepository.findAll().contains (actual));

    }

    @Test
    void updateInfo (){

        MemoryEmployeeRepository employeeRepository = new MemoryEmployeeRepository ();
        employeeRepository.save (new Employee ("8",20000));
        assertEquals (4,employeeRepository.findAll ().size ());

    }

    @Test
    void updateEmployeeInfo (){

        MemoryEmployeeRepository employeeRepository = new MemoryEmployeeRepository ();
        var actual = employeeRepository.save (new Employee ("1",12000));
        assertEquals (actual,employeeRepository.findAll ().get (0));

    }


}