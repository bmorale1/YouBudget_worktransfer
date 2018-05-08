package com.example.isaac.youbudget;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.internal.NavigationMenuItemView;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class budget_list extends AppCompatActivity {

    protected Cursor cursor;
    DataHelper db_center;
    public static budget_list budgets;
    List<RecMaker> record_list;
    RecyclerView recyclerView;
    Recycler actual_recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_and_create);
        //final EditText searchText = new EditText(budgets.this);
        //Toolbar toolbar = findViewById(R.id.toolbar);
        ImageButton menu = findViewById(R.id.menu);
        //ImageButton search = findViewById(R.id.search);
        recyclerView = findViewById(R.id.my_recycler_view);
        final NavigationMenuItemView nav = findViewById(R.id.nav);
        //setSupportActionBar(toolbar);

/*        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), WriteEntry.class));
            }
        });
        */
        budgets = this;
        db_center = new DataHelper(this);
        RefreshList();
        /*final AlertDialog dialog = new AlertDialog.Builder(Entries.this)
                .setTitle("Search")
                .setMessage("Enter your search key")
                .setView(searchText)
                .setPositiveButton("Search", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        SQLiteDatabase db = db_center.getReadableDatabase();
                        String query = "SELECT * FROM diary WHERE dt LIKE ? OR " + "title LIKE ? OR " + "content LIKE ? ORDER by dt DESC";
                        cursor = db.rawQuery(
                                query, new String[] {
                                        "%"+searchText.getText().toString()+"%",
                                        "%"+searchText.getText().toString()+"%",
                                        "%"+searchText.getText().toString()+"%"
                        });
                        RefreshCycle();
                    }
                })
                .setNegativeButton("Reset", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        RefreshList();
                    }
                }).create();
                */
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nav.getVisibility() == View.INVISIBLE) {
                    nav.setVisibility(View.VISIBLE);
                }
                else {
                    nav.setVisibility(View.INVISIBLE);
                }
            }
        });

        ListView navList = findViewById(R.id.navList);
        //navList.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, menuText));
        navList.setSelected(true);
        navList.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView arg0, View arg1, int arg2, long arg3) {
                //Intent in = new Intent(getApplicationContext(), Password.class);
                //startActivity(in);

            }
        });

    }
    public void RefreshList() {
        SQLiteDatabase db = db_center.getReadableDatabase();
        cursor = db.rawQuery("SELECT * FROM diary ORDER BY dt DESC", null);
        RefreshCycle();
    }

    public void RefreshCycle() {
        record_list = new ArrayList<>();
        StringBuffer sB = new StringBuffer();
        RecMaker rMec;
        cursor.moveToFirst();
        cursor.moveToPosition(0);
        for (int cc = 0; cc < cursor.getCount();cc++) {
            cursor.moveToPosition(cc);
            rMec= new RecMaker();
            String title = cursor.getString(1).toString();
            String dt = cursor.getString(0).toString();
            String content = cursor.getString(2).toString();
            //rMec.setTitle(title);
           //rMec.setDate(dt);
            //rMec.setContent(content);
            //sB.append(rMec);
            record_list.add(rMec);
        }
        actual_recycler = new Recycler(record_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(actual_recycler);
        Toast.makeText(getApplicationContext(), "Date Updated", Toast.LENGTH_LONG).show();
    }
}