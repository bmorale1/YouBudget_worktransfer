package com.example.coryyelverton.budgetapp;

/**
 * Created by Cory Yelverton on 4/29/2018.
 */

public class Category {
    String name;
    Boolean isFixed;
    Double monthlySpending;
    Double pieChart;

    public Category(String name, Boolean isFixed, Double monthlySpending,Double pieChart){
        this.name = name;
        this.isFixed = isFixed;
        this.monthlySpending = monthlySpending;
        this.pieChart = pieChart;
    }

    public void createCategories(){
        Category rent = new Category("rent",true,0.00,0.00);
        Category groceries = new Category("groceries",false, 0.00,0.00);
        Category food = new Category("food", false, 0.00,0.00);
        Category utilities = new Category("utilities", true, 0.00,0.00);
        Category entertainment = new Category("entertainment", false,0.00,0.00);
        Category gas = new Category("gas",false,0.00,0.00);
        Category otherBills = new Category("otherBills",false,0.00,0.00);
        Category insurance = new Category("insurance",true,0.00,0.00);
        Category savings = new Category("savings",false,0.00,0.00);
    }

    public String getName(){
        return name;
    }

    public Double getMonthlySpending() {
        return monthlySpending;
    }

    public Boolean getFixed() {
        return isFixed;
    }

    public void setFixed(Boolean fixed) {
        isFixed = fixed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMonthlySpending(Double monthlySpending) {
        this.monthlySpending = monthlySpending;
    }

    public Double getPieChart() {
        return pieChart;
    }

    public void setPieChart(Double pieChart) {
        this.pieChart = pieChart;
    }
}
