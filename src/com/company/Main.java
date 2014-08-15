package com.company;

import java.text.NumberFormat;

public class Main {

    static private NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();


    public static void main(String[] args) {
        Employee nora = new Employee(1600515, "nora");
        Employee william = new Employee (1600516, "william");
        nora.setHourlyRate(12.50);
        william.setHourlyRate(7.95);
        nora.setHoursWorked(55);
        william.setHoursWorked(37);


        System.out.println(currencyFormatter.format(nora.getHourlyRate()) + " per hour" );
        System.out.println(currencyFormatter.format(william.getHourlyRate()) + " per hour");
        System.out.println(currencyFormatter.format(nora.getWages()) + " per week");
        System.out.println(currencyFormatter.format(william.getWages()) + " per week");
    }
}
