package org.example;

import org.example.enums.Plan;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //company
        String[] developerNames = new String[10];
        String[] newDevelopers={"Jane","Joe","David","Adam"};
        Company company =new Company(1,"Hawks",12000.14,developerNames);
        company.addEmployee(0, "John Doe");
        company.addEmployee(1, "Jane Smith");
        company.setDeveloperNames(newDevelopers);
        System.out.println(company.getDeveloperNames());
        System.out.println(company.toString());

        //healthplan
       Healthplan healthplan =new Healthplan("Jane",123, Plan.BASIC);
        System.out.println(healthplan.getId());
        System.out.println(healthplan.getName());
        System.out.println(healthplan.getPlan());

        healthplan.setPlan(Plan.STARTER);
        System.out.println(healthplan.getPlan());

        //employee
        String[] healthplans = new String[5];
        Employee employee = new Employee(1, "John Doe", "john.doe@example.com", "password123", healthplans);
        employee.addHealthPlan(0, "Basic Health Plan");
        employee.addHealthPlan(1, "Premium Health Plan");

        System.out.println(employee.toString());

    }
}