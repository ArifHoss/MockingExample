package com.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MemoryEmployeeRepositoryTest {

    @Test
    void saveToMemory () {

        MemoryEmployeeRepository memoryEmployeeRepository = new MemoryEmployeeRepository ();

        var actual = memoryEmployeeRepository.save (new Employee ("3" , 30000));

        assertThat(memoryEmployeeRepository.findAll().contains (actual));

    }

    @Test
    void findSave(){

        MemoryEmployeeRepository employeeRepository = new MemoryEmployeeRepository ();
        employeeRepository.save (new Employee ("3",20000));
        assertEquals (1,employeeRepository.findAll ().size ());

    }

}