package com.example.isaac.youbudget;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Budget_display extends AppCompatActivity{
        TextView nameBox;
        TextView totalBox;
        TextView savingsBox;
        TextView insuranceBox;
        TextView otherBox;
        TextView entertainmentBox;
        TextView foodBox;
        TextView groceryBox;
        TextView gasBox;
        TextView rentBox;
        TextView utilitiesBox;


        @Override
        protected void onCreate(@Nullable final Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            /*
            setContentView(R.layout.activity_budget_display);


            nameBox = findViewById(R.id.show_name);
            totalBox = findViewById(R.id.show_total);
            savingsBox = findViewById(R.id.show_savings);
            insuranceBox = findViewById(R.id.show_insurance);
            otherBox = findViewById(R.id.show_other);
            entertainmentBox = findViewById(R.id.show_entertainment);
            foodBox = findViewById(R.id.show_food);
            groceryBox = findViewById(R.id.show_grocery);
            gasBox = findViewById(R.id.show_gas);
            rentBox = findViewById(R.id.show_rent);
            utilitiesBox = findViewById(R.id.show_utilities);
            */
        }
        //set boxes
        public TextView getNameBoxText() {
            return nameBox;
        }
        public TextView getTotalBox() {
            return totalBox;
        }
        public TextView getEntertainmentBox() {
            return entertainmentBox;
        }
        public TextView getRentBox() {
            return rentBox;
        }
        public TextView getInsuranceBox() {
            return insuranceBox;
        }
        public TextView getOtherBox() {
            return otherBox;
        }
        public TextView getSavingsBox() {
            return savingsBox;
        }
        public TextView getFoodBox() {
            return foodBox;
        }
        public TextView getGroceryBox() {
            return groceryBox;
        }
        public TextView getGasBox() {
            return gasBox;
        }
        public TextView getUtilitiesBox() {
            return utilitiesBox;
        }
        //getboxes
        public void setNameBox(TextView nameBox) {
            this.nameBox = nameBox;
        }
        public void setTotalBox(TextView totalBox) {
            this.totalBox = totalBox;
        }
        public void setEntertainmentBox(TextView entertainmentBox) {
            this.entertainmentBox = entertainmentBox;
        }
        public void setRentBox(TextView rentBox) {
            this.rentBox = rentBox;
        }
        public void setInsuranceBox(TextView insuranceBox) {
            this.insuranceBox = insuranceBox;
        }
        public void setOtherBox(TextView otherBox) {
            this.otherBox = otherBox;
        }
        public void setFoodBox(TextView foodBox) {
            this.foodBox = foodBox;
        }
        public void setGroceryBox(TextView groceryBox) {
            this.groceryBox = groceryBox;
        }
        public void setGasBox(TextView gasBox) {
            this.gasBox = gasBox;
        }
        public void setUtilitiesBox(TextView utilitiesBox) {
            this.utilitiesBox = utilitiesBox;
        }
    }


