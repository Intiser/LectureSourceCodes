package com.example.teacher.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] strings = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"
            ,"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"
    };

    ArrayList<Item>dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list_view);
        initData();
        ListAdapter listAdapter = new ListAdapter(this, dataList);
        listView.setAdapter(listAdapter);
        //ArrayAdapter<String>arrayAdapter = new ArrayAdapter<String>(this,R.layout.list_item,strings);
        //listView.setAdapter(arrayAdapter);
    }

    void initData(){
        dataList = new ArrayList<>();
        dataList.add(new Item(R.drawable.img,"Saturday"));
        dataList.add(new Item(R.drawable.img2,"Saturday1"));
        dataList.add(new Item(R.drawable.img,"Saturday2"));
        dataList.add(new Item(R.drawable.img2,"Saturday3"));
        dataList.add(new Item(R.drawable.img2,"Saturday4"));
        dataList.add(new Item(R.drawable.img,"Saturday5"));
        dataList.add(new Item(R.drawable.img2,"Saturday6"));
        dataList.add(new Item(R.drawable.img2,"Saturday7"));
        dataList.add(new Item(R.drawable.img2,"Saturday8"));
        dataList.add(new Item(R.drawable.img,"Saturday9"));
        dataList.add(new Item(R.drawable.img2,"Saturday10"));
        dataList.add(new Item(R.drawable.img,"Saturday11"));
        dataList.add(new Item(R.drawable.img2,"Saturday12"));
        dataList.add(new Item(R.drawable.img,"Saturday13"));
        dataList.add(new Item(R.drawable.img2,"Saturday14"));
    }
}
