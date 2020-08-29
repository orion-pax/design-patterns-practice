package com.example.design.creational.patterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {
    public static void main( String[] args ) throws IOException {
        GeneratePlanFactory generatePlanFactory = new GeneratePlanFactory();
        System.out.println("Enter the type of plan for which the bill will be calculated..");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String planType = bufferedReader.readLine();
        System.out.println("Enter the number of units to be calculated for the bill..");
        int units = Integer.parseInt(bufferedReader.readLine());

        Plan plan = generatePlanFactory.getPlan(planType);
        plan.getRate();

        System.out.println(String.format("Bill for %d units using %s is ::",units,planType));
        plan.calculateBill(units);
    }
}
