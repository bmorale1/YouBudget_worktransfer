package com.example.coryyelverton.budgetapp;

/**
 * Created by Cory Yelverton on 5/5/2018.
 */

public class Item {
    double cost;
    boolean wasNeeded;

    public Item(double cost, boolean wasNeeded){
        this.cost = cost;
        this.wasNeeded = wasNeeded;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
    }

    public void setWasNeeded(boolean wasNeeded) {
        this.wasNeeded = wasNeeded;
    }

    public boolean isWasNeeded() {
        return wasNeeded;
    }
}
