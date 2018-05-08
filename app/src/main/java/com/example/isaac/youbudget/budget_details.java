package com.example.isaac.youbudget;

/**
 * Created by Cory Yelverton on 5/5/2018.
 */
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


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

        setContentView(R.layout.budget_details);

        nameEditText = (EditText)findViewById(R.id.name_field);
        nameTextView = (TextView)findViewById(R.id.budget_name);
        totalEditText = (EditText)findViewById(R.id.total_field);
        //totalTextView = (TextView)findViewById(R.id.show_total);
        groceryEditText = (EditText)findViewById(R.id.grocery_field);
        //groceryTextView = (TextView)findViewById(R.id.show_grocery);
        foodEditText = (EditText)findViewById(R.id.Food_field);
        //foodTextView = (TextView)findViewById(R.id.show_food);
        gasEditText = (EditText)findViewById(R.id.Gas_field);
        //gasTextView = (TextView)findViewById(R.id.show_gas);
        entertainmentEditText = (EditText)findViewById(R.id.Entertainment_field);
        //entertainmentTextView = (TextView)findViewById(R.id.show_entertainment);
        rentEditText = (EditText)findViewById(R.id.rent_field);
        //rentTextView = (TextView)findViewById(R.id.show_rent);
        savingsEditText = (EditText)findViewById(R.id.savings_field);
        //savingsTextView = (TextView)findViewById(R.id.show_savings);
        utilitiesEditText = (EditText)findViewById(R.id.Utilities_field);
        //utilitiesTextView = (TextView)findViewById(R.id.show_utilities);
        otherEditText = (EditText)findViewById(R.id.other_field);
        //otherTextView = (TextView)findViewById(R.id.other_txt);
        insuranceEditText = (EditText)findViewById(R.id.Insurance_field);
        //insuranceTextView = (TextView)findViewById(R.id.show_insurance);
        save = (FloatingActionButton)findViewById(R.id.floatingActionButton);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = String.valueOf(nameEditText.getText());
                nameEditText.setText(name);
                total = String.valueOf(totalEditText.getText());
                totalEditText.setText(total);
                grocery = String.valueOf(groceryEditText.getText());
                groceryEditText.setText(grocery);
                food = String.valueOf(foodEditText.getText());
                foodEditText.setText(food);
                gas = String.valueOf(gasEditText.getText());
                gasEditText.setText(gas);
                entertainment = String.valueOf(entertainmentEditText.getText());
                entertainmentEditText.setText(entertainment);
                rent = String.valueOf(rentEditText.getText());
                rentEditText.setText(rent);
                savings = String.valueOf(savingsEditText.getText());
                savingsEditText.setText(savings);
                utilities = String.valueOf(utilitiesEditText.getText());
                utilitiesEditText.setText(utilities);
                other = String.valueOf(otherEditText.getText());
                otherEditText.setText(other);
                insurance = String.valueOf(insuranceEditText.getText());
                insuranceEditText.setText(insurance);


            }
        });

    }
}
