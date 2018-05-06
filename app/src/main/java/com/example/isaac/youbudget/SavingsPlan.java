package com.example.coryyelverton.budgetapp;

/**
 * Created by Cory Yelverton on 4/29/2018.
 */

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class SavingsPlan {
    Long startingDate;
    Long endingDate;
    double savingsGoal;
    double total;
    ArrayList spendingList = new ArrayList<Item>();

    public SavingsPlan(Long startingDate, Long endingDate, double savingsGoal){
        this.startingDate = startingDate;
        this.endingDate = endingDate;
        this.savingsGoal = savingsGoal;
    }

    //calculate days
    //calculate savings plans
    //pie chart stuff

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


}
