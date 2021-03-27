package com.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MemoryEmployeeRepositoryIT {

    @Test
    void integrationstest () {

        MemoryEmployeeRepository employeeRepository = new MemoryEmployeeRepository ();

        BankService bankService = new TestClassBankService ();

        EmployeeManager employeeManager = new EmployeeManager (employeeRepository , bankService);

       //var actual= employeeRepository.save (new Employee ("1",12000));
        //assertEquals (actual,employeeRepository.findAll ().get (1));
        //assertThat (employeeManager.payEmployees ()).isNotNull ();
        assertEquals (3,employeeManager.payEmployees ());

    }

}