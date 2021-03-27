package com.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MemoryEmployeeRepositoryIT {

    @Test
    void integrationstest () {
        MemoryEmployeeRepository employeeRepository = new MemoryEmployeeRepository ();
        BankService bankService = new TestClassBankService ();
        employeeRepository.save (new Employee ("1",12000));
        EmployeeManager employeeManager = new EmployeeManager (employeeRepository , bankService);

        assertThat (employeeManager.payEmployees ()).isEqualTo (employeeRepository);
    }

}