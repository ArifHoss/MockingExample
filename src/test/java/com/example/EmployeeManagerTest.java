package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeManagerTest {

    @Test
    void makePayment(){
        EmployeeRepository employeeRepository = new testEmployRepository();
        BankService bankService = new TestBankService();
        EmployeeManager employeeManager = new EmployeeManager (employeeRepository,bankService);

        //var actual =  employeeManager.payEmployees ();
        assertEquals(2,employeeManager.payEmployees ());
    }



}