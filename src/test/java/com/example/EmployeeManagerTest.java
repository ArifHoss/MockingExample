package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

class EmployeeManagerTest {

    static EmployeeRepository employeeRepository = new testEmployRepository();
    static BankService bankService = new TestBankService();
    static EmployeeManager employeeManager = new EmployeeManager (employeeRepository,bankService);

    @Test
    void makePayment(){
        assertEquals(2,employeeManager.payEmployees ());
    }

    @Test
    void setPaymentFalse(){
        assertFalse(employeeManager.payEmployees ()==0);
    }

}