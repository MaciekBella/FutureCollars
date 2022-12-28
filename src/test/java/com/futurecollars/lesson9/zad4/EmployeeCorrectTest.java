package com.futurecollars.lesson9.zad4;

import com.futurcollars.lesson9.zad4.EmployeeCorrect;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class EmployeeCorrectTest {

    @Test
    void shouldRetrieveEmployeeDescription() {
        //given
        EmployeeCorrect employeeCorrect = new EmployeeCorrect("John", "Smith");
        //when
        String actualEmployeeInfo = employeeCorrect.getEmployeeInfo();
        //then
        Assertions.assertNotNull(actualEmployeeInfo);
        Assertions.assertEquals("Employee name : John Smith", actualEmployeeInfo);
    }

    @Test
    void shouldRetrieveEmployeeDetailsWithAge() {
        //given
        EmployeeCorrect employeeCorrect = new EmployeeCorrect("John", "Smith", 45);
        //when
        String actualEmployeeDetails = employeeCorrect.getEmployeeDetails();
        //then
        Assertions.assertNotNull(actualEmployeeDetails);
        Assertions.assertEquals("Employee details : John Smith is 45", actualEmployeeDetails);
    }

    @Test
    void shouldRetrieveBaseSalary() {
        //given
        BigDecimal baseSalary = new BigDecimal("3000");
        EmployeeCorrect employeeCorrect = new EmployeeCorrect("John", "Smith", 45, baseSalary);
        //when
        BigDecimal actualBaseSalary = employeeCorrect.getBaseSalary();
        //then
        Assertions.assertNotNull(actualBaseSalary);
        Assertions.assertEquals(baseSalary, actualBaseSalary);
    }

    @Test
    void shouldRetrieveBaseSalaryWithBonus() {
        //given
        BigDecimal baseSalary = new BigDecimal("3000");
        BigDecimal bonus = new BigDecimal("500");
        EmployeeCorrect employeeCorrect = new EmployeeCorrect("John", "Smith", 45, baseSalary, bonus);
        //when
        BigDecimal actualTotalSalary = employeeCorrect.getFullSalary();
        //then
        Assertions.assertNotNull(actualTotalSalary);
        Assertions.assertEquals(baseSalary.add(bonus), actualTotalSalary);
    }

    @Test
    void shouldRetrieveEmployeeBonus() {
        //given
        BigDecimal baseSalary = new BigDecimal("3000");
        BigDecimal bonus = new BigDecimal("500");
        EmployeeCorrect employee = new EmployeeCorrect("John", "Smith", 45, baseSalary, bonus);
        //when
        BigDecimal actualBonus = employee.getBonus();
        //then
        Assertions.assertNotNull(actualBonus);
        Assertions.assertEquals(bonus, actualBonus);
    }
}
