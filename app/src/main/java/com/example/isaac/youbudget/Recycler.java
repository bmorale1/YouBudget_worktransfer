package com.example.isaac.youbudget;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.TimeZone;


public class Recycler extends RecyclerView.Adapter<Recycler.VHolder> {
    private List<RecMaker> mRec;
    private Context mContext;
    private RecyclerView mRecV;
    final SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public Recycler(List<RecMaker> mRec) {
        this.mRec = mRec;
    }

    public class VHolder extends RecyclerView.ViewHolder {
        public TextView title_View;
        public TextView date_View;
        public TextView month_View;
        public TextView content_View;
        public String date;


        public VHolder(View v) {
            super(v);
           // title_View = v.findViewById(R.id.tit);
            date_View = v.findViewById(R.id.date);
            //month_View = v.findViewById(R.id.month);
            //content_View = v.findViewById(R.id.con);
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Intent in =new Intent(entryList, OpenEntry.class);
                    //in.putExtra("diary", title_View.getText().toString());
                    //in.putExtra("con", content_View.getText().toString());
                    //in.putExtra("date", date.toString());
                   //entryList.startActivity(in);
                }
            });
        }
    }

    public Recycler(List<RecMaker> myDataset, Context context, RecyclerView recyclerView) {
        mRec = myDataset;
        mContext = context;
        mRecV = recyclerView;
    }
    @Override
    public VHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_recycler,null);

        return new VHolder(v);
    }

    int month;
    String[] strMonths;
    String monthName,dom;
    @Override
    public void onBindViewHolder(VHolder holder, final int position) {
        Calendar GCalendar = GregorianCalendar.getInstance(TimeZone.getDefault());
        RecMaker mrec = mRec.get(position);

        try {
            GCalendar.setTime(dateFormatter.parse(mrec.getDate().toString()));
            month = GCalendar.get(Calendar.MONTH)+1;
            strMonths = new String[] { "DEC", "JAN", "FEB", "MAR", "APR", "MEI", "JUN",
                    "JUL", "AUG", "SEP", "OCT", "NOV", "DEC" };
            monthName = strMonths[month];
            dom = String.valueOf(GCalendar.get(Calendar.DAY_OF_MONTH));

        } catch (ParseException e) {
            e.printStackTrace();
        }

        holder.title_View.setText(mrec.getTitle().toString());
        holder.date_View.setText(dom.toString());
        holder.month_View.setText(monthName.toString());
        holder.content_View.setText(mrec.getContent().toString());
        holder.date = mrec.getDate().toString();
    }

    @Override
    public int getItemCount() {
        return mRec.size();
    }
}


