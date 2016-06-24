package com.example.android.block1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Button btblue,btpink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btblue= (Button)findViewById(R.id.button_blueinvisible);
        btpink=(Button) findViewById(R.id.button_pink);
    }
    public void toDo(View v)
    {
        if(v.equals(btblue)) //invisible
        v.setVisibility(View.INVISIBLE);
        if(v.equals(btpink)) //pop up (called toast in android)
            Toast.makeText(MainActivity.this, "Toast activated", Toast.LENGTH_SHORT).show();
    }
}