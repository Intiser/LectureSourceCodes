package com.ahsan.intiser.helloworld2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private static final String TAG = MainActivity.class.getName();
    TextView textView;
    EditText editText;
    ImageView imageView;
    Button button;
    ImageButton imageButton;
    SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textview);
        editText = findViewById(R.id.edit_text);
        imageView = findViewById(R.id.imageview);
        button = findViewById(R.id.button);
        imageButton = findViewById(R.id.image_button);
        seekBar = findViewById(R.id.seekbar);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == button.getId()) {
            Log.d(TAG, "onClick: " + " button clicked");
        }
    }
}
