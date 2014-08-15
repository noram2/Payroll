package com.company;

/**
 * Created by noramitchell on 8/14/14.
 */
public class Employee {
    private static double MinimumWage = 7.50;
    private int id;
    private String name;
    private double hourlyRate;
    private double hoursWorked;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate < MinimumWage)
            throw new IllegalArgumentException("hourly rate must be greater than or equal to " + MinimumWage);
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getWages() {
        if (hoursWorked <= 40)
            return hourlyRate * hoursWorked;
        else
            return (hourlyRate * 40) + (hoursWorked - 40) * hourlyRate * 1.5;
    }

}
