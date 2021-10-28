package com.example.mpp.polymerphism.employee;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kojusujan1111@gmail.com 28/10/21
 */

public class Test {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Staff());
        employees.add(new Faculty());

        int sumOfSalary = 0;

        for (Employee e : employees) {
            sumOfSalary = sumOfSalary + e.computeSalary();
        }
        System.out.println("SUM OF SALARY --> " + sumOfSalary);
    }
}
