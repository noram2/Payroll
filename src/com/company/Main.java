package com.company;

import java.text.NumberFormat;

public class Main {

    static private NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();


    public static void main(String[] args) {
        Employee nora = new Employee(1600515, "nora");
        Employee william = new Employee (1600516, "william");
        nora.setHourlyRate(12.50);
        william.setHourlyRate(7.95);
        nora.setHoursWorked(50);
        william.setHoursWorked(37);

        System.out.println("$" + nora.getHourlyRate() + " per hour");
        System.out.println("$" + william.getHourlyRate() + " per hour");
        System.out.println("$" + nora.getWages() + " per week");
        System.out.println("$" + william.getWages() + " per week");
        System.out.println(currencyFormatter.format(nora.getHourlyRate()));
        System.out.println(currencyFormatter.format(william.getHourlyRate()));
        System.out.println(currencyFormatter.format(nora.getWages()));
        System.out.println(currencyFormatter.format(william.getWages()));
    }
}
