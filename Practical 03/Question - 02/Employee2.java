package com.mycompany.practical3_2;

public class Employee {
    private String name;
    private double bSalary;
    private double bonus;

    // Constructor
    public Employee(String name, double bSalary, double bonus) {
        this.name = name;
        this.bSalary = bSalary;
        this.bonus = bonus;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return bSalary;
    }

    public double getBonus() {
        return bonus;
    }

    // Bonus Amount Calculation
    public double calculateBonusAmount() {
        return bSalary + bonus;
    }
}
