package com.example.killua4564.hwapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ChildActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);
        this.textView = (TextView) this.findViewById(R.id.textView);
        Intent intent = this.getIntent();
        if (intent.hasExtra("string")){
            this.textView.setText(intent.getStringExtra("string"));
        }
    }
}
