package com.example.prachi.timeutilsexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.timeutility.DisplayToast;


public class MainActivity extends AppCompatActivity {
    private Button mButton;
    DisplayToast displayToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton=(Button)findViewById(R.id.b1);
        displayToast=new DisplayToast();
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToast.showAToast(MainActivity.this,"Hi"
                );
            }
        });
    }
}
