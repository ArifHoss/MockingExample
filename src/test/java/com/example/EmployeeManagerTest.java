package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        assertNotEquals (employeeManager.payEmployees () , 0);
    }

}