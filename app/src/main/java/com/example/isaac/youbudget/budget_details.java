package com.example.isaac.youbudget;

/**
 * Created by Cory Yelverton on 5/5/2018.
 */
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import javax.microedition.khronos.egl.EGLDisplay;

public class budget_details extends AppCompatActivity {
    private EditText nameEditText;
    private TextView nameTextView;
    private EditText totalEditText;
    private TextView totalTextView;
    private EditText groceryEditText;
    private TextView groceryTextView;
    private EditText foodEditText;
    private TextView foodTextView;
    private EditText gasEditText;
    private TextView gasTextView;
    private EditText entertainmentEditText;
    private TextView entertainmentTextView;
    private EditText rentEditText;
    private TextView rentTextView;
    private EditText savingsEditText;
    private TextView savingsTextView;
    private EditText utilitiesEditText;
    private TextView utilitiesTextView;
    private EditText otherEditText;
    private TextView otherTextView;
    private EditText insuranceEditText;
    private TextView insuranceTextView;
    private FloatingActionButton save;
    private String name;
    private String total;
    private String grocery;
    private String food;
    private String gas;
    private String entertainment;
    private String rent;
    private String savings;
    private String utilities;
    private String other;
    private String insurance;

    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        nameEditText = (EditText)findViewById(R.id.name_field);
        nameTextView = (TextView)findViewById(R.id.textView21);
        totalEditText = (EditText)findViewById(R.id.total_field);
        totalTextView = (TextView)findViewById(R.id.textView20);
        groceryEditText = (EditText)findViewById(R.id.grocery_field);
        groceryTextView = (TextView)findViewById(R.id.textView6);
        foodEditText = (EditText)findViewById(R.id.Food_field);
        foodTextView = (TextView)findViewById(R.id.textView23);
        gasEditText = (EditText)findViewById(R.id.Gas_field);
        gasTextView = (TextView)findViewById(R.id.textView28);
        entertainmentEditText = (EditText)findViewById(R.id.Entertainment_field);
        entertainmentTextView = (TextView)findViewById(R.id.textView29);
        rentEditText = (EditText)findViewById(R.id.rent_field);
        rentTextView = (TextView)findViewById(R.id.textView25);
        savingsEditText = (EditText)findViewById(R.id.savings_field);
        savingsTextView = (TextView)findViewById(R.id.textView22);
        utilitiesEditText = (EditText)findViewById(R.id.Utilities_field);
        utilitiesTextView = (TextView)findViewById(R.id.textView26);
        otherEditText = (EditText)findViewById(R.id.other_field);
        otherTextView = (TextView)findViewById(R.id.textView30);
        insuranceEditText = (EditText)findViewById(R.id.Insurance_field);
        insuranceTextView = (TextView)findViewById(R.id.textView27);
        save = (FloatingActionButton)findViewById(R.id.floatingActionButton);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = String.valueOf(nameEditText.getText());
                nameTextView.setText(name);
                total = String.valueOf(totalEditText.getText());
                totalTextView.setText(total);
                grocery = String.valueOf(groceryEditText.getText());
                groceryTextView.setText(grocery);
                food = String.valueOf(foodEditText.getText());
                foodTextView.setText(food);
                gas = String.valueOf(gasEditText.getText());
                gasTextView.setText(gas);
                entertainment = String.valueOf(entertainmentEditText.getText());
                entertainmentTextView.setText(entertainment);
                rent = String.valueOf(rentEditText.getText());
                rentTextView.setText(rent);
                savings = String.valueOf(savingsEditText.getText());
                savingsTextView.setText(savings);
                utilities = String.valueOf(utilitiesEditText.getText());
                utilitiesTextView.setText(utilities);
                other = String.valueOf(otherEditText.getText());
                otherTextView.setText(other);
                insurance = String.valueOf(insuranceEditText.getText());
                insuranceTextView.setText(insurance);


            }
        });

    }
}
