package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class EmployeeManagerMockTest {
    static EmployeeRepository employeeRepository = mock(EmployeeRepository.class);
    static BankService bankService = mock (BankService.class);
    static EmployeeManager employeeManager = new EmployeeManager (employeeRepository,bankService);

    @Test
    void makePayment(){
    when (employeeRepository.findAll ()).thenReturn (List.of (new Employee ("1",30000),
            new Employee ("2", 35000)));
    assertEquals (2,employeeManager.payEmployees ());
    }

    @Test
    void setPaymentFalse(){
        when (employeeRepository.findAll ()).thenReturn (List.of (new Employee ("1",30000),
                new Employee ("2", 35000)));

        assertFalse(employeeManager.payEmployees ()==0);

    }
}