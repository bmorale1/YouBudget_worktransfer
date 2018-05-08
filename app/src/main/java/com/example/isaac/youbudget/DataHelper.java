package com.example.isaac.youbudget;

/**
 * Created by Cory Yelverton on 5/6/2018.
 */
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.TextView;


public class DataHelper extends SQLiteOpenHelper{

    private static final String DATABASE_NAME = "Budget.db";
    private static final int DATABASE_VERSION = 1;
    public DataHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        // TODO Auto-generated constructor stub
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        String sql = "create table budget1(" +
                "dt datetime null, " +
                "title text null, " +
                "total int null, " +
                "Rent int null, " +
                "Food int null" +
                "Groceries int null" +
                "Gas int null" +
                "Entertainment int null" +
                "Savings int null" +
                "Utilities int null" +
                "Insurance int null" +
                "OtherExpenses int null)";
        //Log.d("Journal", "onCreate: " + sql);
        //db.execSQL(sql);
        //String sql2 = "create table account(username text, password text, email text);";
        //Log.d("Data Entry", "onCreate: " + sql2);
        //db.execSQL(sql2);
    }
    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2)
    {
        // TODO Auto-generated method stub
    }
}
