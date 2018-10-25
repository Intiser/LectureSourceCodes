package com.kitegames.listviewwithimage;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String Titles[];
    String Descriptions[];
    int images[] = { R.drawable.pic1, R.drawable.pic2 , R.drawable.pic3 ,
                      R.drawable.pic4, R.drawable.pic5 , R.drawable.pic6 ,
                         R.drawable.pic7, R.drawable.pic8 , R.drawable.pic9, R.drawable.pic10 };

    ListView LV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();
        Titles = res.getStringArray(R.array.names);
        Descriptions = res.getStringArray(R.array.description);
        LV = findViewById(R.id.listview);
        Adapter adapter = new Adapter(this,Titles,images,Descriptions);
        LV.setAdapter(adapter);
    }

}


class Adapter extends ArrayAdapter<String>{

    Context context;
    String Title[];
    String Descriptions[];
    int images[];
    Adapter(Context c, String resources[],int imgs[],String desc[]){
        super(c,R.layout.single_row,R.id.text_view1,resources);
        this.context = c;
        this.Title = resources;
        this.images = imgs;
        this.Descriptions = desc;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;
        MyViewHolder holder;
        if (row == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.single_row, parent, false);
            holder = new MyViewHolder(row);
            row.setTag(holder);

        }else{
            holder = (MyViewHolder) row.getTag();
        }

        holder.imageView.setImageResource(images[position]);
        holder.textView1.setText(Title[position]);
        holder.textView2.setText(Descriptions[position]);
        return row;
    }

    class MyViewHolder{
        ImageView imageView;
        TextView textView1;
        TextView textView2;
        MyViewHolder(View v){
            imageView = v.findViewById(R.id.image_view);
            textView1 = v.findViewById(R.id.text_view1);
            textView2 = v.findViewById(R.id.text_view2);
        }
    }

}