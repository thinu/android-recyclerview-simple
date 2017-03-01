package com.example.thinuwan.android_recyclerview_simple;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by thinuwan on 3/1/17.
 */

public class MyAdapter extends RecyclerView.Adapter<MyHolder> {

    Context mContext;
    String[] items;

    public MyAdapter(Context mContext, String[] items) {
        this.mContext = mContext;
        this.items = items;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.recyclerview_row,parent,false);
        MyHolder holder = new MyHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        holder.textview_recyclereview_row.setText(items[position]);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}


class MyHolder extends RecyclerView.ViewHolder {

    TextView textview_recyclereview_row;

    public MyHolder(View itemView) {
        super(itemView);

        textview_recyclereview_row = (TextView)itemView.findViewById(R.id.textview_recyclereview_row);
    }
}