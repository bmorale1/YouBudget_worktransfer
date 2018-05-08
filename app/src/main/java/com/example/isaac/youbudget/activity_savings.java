package com.example.isaac.youbudget;

/**
 * Created by Cory Yelverton on 5/8/2018.
 */

import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class activity_savings extends AppCompatActivity{
//saveLength = radio group
    //DaysBTN, WeeksBTn, MonthsBTN, YearsBTN
//Lengthln - how long
//Saveln - how much
//InPay - savings budget
//PayPeriod = radio group
    //WeeklyBtn, BiweeklyBtn, MonthlyBtn, YearlyBtn
//Submit = button
//ResultField = textview

    private RadioGroup saveLength;
    private RadioButton daysBTN;
    private RadioButton weeksBTN;
    private RadioButton monthsBTN;
    private RadioButton yearsBTN;
    private EditText lengthln;
    private EditText saveln;
    private EditText inPay;
    private RadioGroup payPeriod;
    private RadioButton weeklyBTN;
    private RadioButton biweeklyBTN;
    private RadioButton monthlyBTN;
    private RadioButton yearlyBTN;
    private Button submit;
    private TextView resultField;
    private double total;
    private int payPeriodInternval;
    private int payPeriodIntervalNumber;
    private int savingsInterval;
    private int savingsIntervalNumber;
    private double savingsAmount;
    private double paycheckAmount;
    private SavingsPlan sp;
    private String toString;

    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        saveLength = (RadioGroup)findViewById(R.id.saveLength);
        daysBTN = (RadioButton)findViewById(R.id.DaysBtn);
        weeksBTN = (RadioButton)findViewById(R.id.WeeksBtn);
        monthsBTN = (RadioButton)findViewById(R.id.MonthsBtn);
        yearsBTN = (RadioButton)findViewById(R.id.YearsBtn);
        lengthln = (EditText)findViewById(R.id.LengthIn);
        saveln = (EditText)findViewById(R.id.SaveIn);
        inPay = (EditText)findViewById(R.id.InPay);
        payPeriod = (RadioGroup) findViewById(R.id.PayPeriod);
        weeklyBTN = (RadioButton)findViewById(R.id.WeeklyBtn);
        biweeklyBTN = (RadioButton)findViewById(R.id.BiweeklyBtn);
        monthlyBTN = (RadioButton)findViewById(R.id.MonthlyBtn);
        yearlyBTN = (RadioButton)findViewById(R.id.YearlyBtn);
        submit = (Button)findViewById(R.id.Submit);
        resultField = (TextView)findViewById(R.id.ResultField);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(daysBTN.isActivated()){
                    savingsInterval = 1;
                }
                else if(weeksBTN.isActivated()){
                    savingsInterval = 2;
                }
                else if(monthsBTN.isActivated()){
                    savingsInterval = 3;
                }
                else if(yearsBTN.isActivated()){
                    savingsInterval = 4;
                }
                savingsIntervalNumber = Integer.valueOf(lengthln.getText().toString());
                total = Integer.valueOf(saveln.getText().toString());
                payPeriodIntervalNumber = Integer.valueOf(inPay.getText().toString());
                if(weeklyBTN.isActivated()){
                    payPeriodInternval = 1;
                }
                else if(biweeklyBTN.isActivated()){
                    payPeriodInternval = 2;
                }
                else if(monthlyBTN.isActivated()){
                    payPeriodInternval = 3;
                }
                else if(yearlyBTN.isActivated()){
                    payPeriodInternval = 4;
                }
                 savingsAmount = sp.calculateRequiredSavings(savingsIntervalNumber, total);
                 paycheckAmount = sp.paycheckRequiredSavings(payPeriodIntervalNumber,total,payPeriodInternval);
                 toString = sp.paycheckToString(paycheckAmount,payPeriodInternval) + "/n" + sp.savingsToString(savingsAmount,savingsInterval);
                 resultField.setText(toString);
            }
        });


    }
}

