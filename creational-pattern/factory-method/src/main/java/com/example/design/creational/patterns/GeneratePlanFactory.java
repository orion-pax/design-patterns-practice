package com.example.design.creational.patterns;

public class GeneratePlanFactory {

    public Plan getPlan(String planType){
        if(planType == null){
            return null;
        }
        if(planType.equalsIgnoreCase("domesticplan")){
            return  new DomesticPlan();
        }else if(planType.equalsIgnoreCase("commercialplan")){
            return new CommercialPlan();
        }
        return null;
    }
}
