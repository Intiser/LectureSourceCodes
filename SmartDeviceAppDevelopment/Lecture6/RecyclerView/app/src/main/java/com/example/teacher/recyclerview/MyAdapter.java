package com.example.teacher.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.Holder> {

    ArrayList<Item>arrayList;
    Context context;
    LayoutInflater inflater;
    int selectedPosition = 0;

    MyAdapter(Context context, ArrayList<Item>arrayList){
        this.context = context;
        this.arrayList = arrayList;
        inflater = LayoutInflater.from(context);
    }


    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_list, parent, false);
        Holder holder = new Holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, final int position) {
        Item item = arrayList.get(position);
        holder.textViewTitle.setText(item.getTitle());
        holder.textViewDescription.setText(item.getDescription());
        if(selectedPosition == position){
            holder.layout.setBackgroundColor(context.getResources().getColor(R.color.colorBlue));
        }
        else{
            holder.layout.setBackgroundColor(context.getResources().getColor(R.color.colorWhite));
        }
        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedPosition = position;
                notifyDataSetChanged();
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class Holder extends RecyclerView.ViewHolder{

        TextView textViewTitle;
        TextView textViewDescription;
        RelativeLayout layout;

        public Holder(View itemView) {
            super(itemView);
            textViewTitle = itemView.findViewById(R.id.textview1);
            textViewDescription = itemView.findViewById(R.id.textview2);
            layout = itemView.findViewById(R.id.layout);
        }
    }
}
