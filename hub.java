package com.example.isaac.youbudget;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class hub extends AppCompatActivity{

    Button create;
    Button view;
    Button savings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hub);
        create = findViewById(R.id.create_btn);
        view = findViewById(R.id.view_btn);
        savings = findViewById(R.id.savings_btn);
        final Intent intent1 = new Intent(this, budget_details.class);
        final Intent intent2 = new Intent(this, budget_details.class);
        final Intent intent3 = new Intent(this, activity_savings.class);
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent1);
                finish();
            }
        });
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent2);
                finish();
            }
        });
        savings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                startActivity(intent3);
                finish();
            }
        });
    }

}
