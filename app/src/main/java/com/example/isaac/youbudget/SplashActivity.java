package com.example.isaac.youbudget;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;


public class SplashActivity extends AppCompatActivity {
    protected Cursor cursor;
    DataHelper data_base_center;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        data_base_center = new DataHelper(this);

        final Intent intentL = new Intent(this, createAndView.class);
        SQLiteDatabase db = data_base_center.getReadableDatabase();
        cursor = db.rawQuery("SELECT * FROM account", null);
        cursor.moveToFirst();
        new CountDownTimer(3000,1000) {
                @Override
                public void onTick(long l) {
                }
                public void onFinish() {
                    startActivity(intentL);
                    finish();
                }
            }.start();
        }

}
