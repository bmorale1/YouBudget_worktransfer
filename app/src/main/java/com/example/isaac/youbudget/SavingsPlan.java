package com.example.isaac.youbudget;

/**
 * Created by Cory Yelverton on 4/29/2018.
 */

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class SavingsPlan {
    Long startingDate;
    int savingsInterval;
    int savingsIntervalNumber;
    int payPeriodInterval;
    int payPeriodIntervalNumber;
    Long endingDate;
    double savingsGoal;
    double mySavings;
    double periodSavings;
    double total;
    String savingsMessage;
    ArrayList spendingList = new ArrayList<Item>();

    public SavingsPlan(int savingsInterval, int savingsIntervalNumber, int payPeriodInterval, int payPeriodIntervalNumber, double total){
        this.savingsInterval = savingsInterval;
        this.savingsIntervalNumber = savingsIntervalNumber;
        this.payPeriodInterval = payPeriodInterval;
        this.payPeriodIntervalNumber =  payPeriodIntervalNumber;
        this.total = total;
    }
    public double calculateRequiredSavings(int savingsIntervalNumber, double total){
       mySavings = total/savingsIntervalNumber;
       return mySavings;
    }
    public double paycheckRequiredSavings(int savingsIntervalNumber, double total, int savingsInterval){
        periodSavings = 0;
        if(savingsInterval == 1){
            periodSavings = total/savingsIntervalNumber;
        }
        else if(savingsInterval == 2){
            periodSavings = total/savingsIntervalNumber;
        }
        else if(savingsInterval == 3){
            periodSavings = total/savingsIntervalNumber;
        }
        else if(savingsInterval == 4){
            periodSavings = total/savingsIntervalNumber;
        }
        return periodSavings;
    }
    public String savingsToString(double mySavings, int savingsInterval){
        if(savingsInterval == 1) {
           savingsMessage = "You need to save " + mySavings + "per week.";
       }
       else if(savingsInterval == 2){
           savingsMessage = "You need to save " + mySavings + "per month.";
       }
       else  if(savingsInterval == 3){
           savingsMessage = "You need to save " + mySavings + "per year.";
       }
       return savingsMessage;
    }
    public String paycheckToString(double paycheckSavings, int payPeriodInterval){
        savingsMessage = "You need to save " + paycheckSavings + "per paycheck";
        return savingsMessage;

    }





    public long daysToDate(Date startingDate, Date endingDate, TimeUnit timeUnit){
        long diffInMillies = endingDate.getTime() - startingDate.getTime();
        return  timeUnit.convert(diffInMillies,TimeUnit.DAYS);
    }

    public void newSpendingItem(Item item, double cost, boolean isNeeded, ArrayList spendingList ){
        spendingList.add( new Item(cost, isNeeded));
    }
    public double calculateTotalCost(ArrayList<Item> spendingList){
        total = 0;
        for(int i = 0; i < spendingList.size(); i++){
            total += spendingList.get(i).getCost();
        }
        return total;
    }

    public double percentSavings(ArrayList<Item> spendingList,double percent ){
        total = 0;
        for(int k = 0; k < spendingList.size(); k++){
            if(spendingList.get(k).isWasNeeded() == false ){
                total += spendingList.get(k).getCost() * percent;
            }
        }
        return total;
    }

    public double getTotal() {
        return total;
    }

    public int getPayPeriodInterval() {
        return payPeriodInterval;
    }

    public int getPayPeriodIntervalNumber() {
        return payPeriodIntervalNumber;
    }

    public int getSavingsInterval() {
        return savingsInterval;
    }

    public int getSavingsIntervalNumber() {
        return savingsIntervalNumber;
    }

    public void setPayPeriodInterval(int payPeriodInterval) {
        this.payPeriodInterval = payPeriodInterval;
    }

    public void setSavingsInterval(int savingsInterval) {
        this.savingsInterval = savingsInterval;
    }

    public void setSavingsIntervalNumber(int savingsIntervalNumber) {
        this.savingsIntervalNumber = savingsIntervalNumber;
    }

    public void setPayPeriodIntervalNumber(int payPeriodIntervalNumber) {
        this.payPeriodIntervalNumber = payPeriodIntervalNumber;
    }
}
