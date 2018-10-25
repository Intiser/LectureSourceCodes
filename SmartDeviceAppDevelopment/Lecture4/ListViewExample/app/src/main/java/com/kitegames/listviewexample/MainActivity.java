package com.kitegames.listviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView ll;
    String days[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday",
                        "Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ll = findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.single_row,R.id.textView,days);
        ll.setAdapter(adapter);

    }
}
