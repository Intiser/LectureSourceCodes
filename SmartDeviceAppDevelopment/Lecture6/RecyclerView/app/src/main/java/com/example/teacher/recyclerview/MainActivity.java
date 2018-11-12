package com.example.teacher.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    ArrayList<Item> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);
        initData();
        MyAdapter adapter = new MyAdapter(this, arrayList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false));
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    void initData(){
        arrayList = new ArrayList<>();
        arrayList.add(new Item("TextView","View for Texts"));
        arrayList.add(new Item("ImageView","View for Image"));
        arrayList.add(new Item("ScrollView","View for Scrollable layout"));
        arrayList.add(new Item("RecyclerView","View for Recycling List"));
        arrayList.add(new Item("RecyclerView","View for Recycling List"));
        arrayList.add(new Item("RecyclerView","View for Recycling List"));
        arrayList.add(new Item("RecyclerView","View for Recycling List"));
        arrayList.add(new Item("RecyclerView","View for Recycling List"));
        arrayList.add(new Item("RecyclerView","View for Recycling List"));
        arrayList.add(new Item("RecyclerView","View for Recycling List"));
        arrayList.add(new Item("RecyclerView","View for Recycling List"));
        arrayList.add(new Item("RecyclerView","View for Recycling List"));
        arrayList.add(new Item("RecyclerView","View for Recycling List"));
        arrayList.add(new Item("RecyclerView","View for Recycling List"));
        arrayList.add(new Item("RecyclerView","View for Recycling List"));
        arrayList.add(new Item("RecyclerView","View for Recycling List"));
        arrayList.add(new Item("RecyclerView","View for Recycling List"));
        arrayList.add(new Item("RecyclerView","View for Recycling List"));
        arrayList.add(new Item("RecyclerView","View for Recycling List"));
        arrayList.add(new Item("RecyclerView","View for Recycling List"));
        arrayList.add(new Item("RecyclerView","View for Recycling List"));
        arrayList.add(new Item("RecyclerView","View for Recycling List"));
        arrayList.add(new Item("RecyclerView","View for Recycling List"));
        arrayList.add(new Item("RecyclerView","View for Recycling List"));
        arrayList.add(new Item("RecyclerView","View for Recycling List"));
        arrayList.add(new Item("RecyclerView","View for Recycling List"));
        arrayList.add(new Item("RecyclerView","View for Recycling List"));
        Item item = new Item("RecyclerView","View for Recycling List");
        arrayList.add(item);

    }





}
