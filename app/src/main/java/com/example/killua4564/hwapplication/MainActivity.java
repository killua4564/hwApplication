package com.example.killua4564.hwapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.button = (Button) this.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                editText = (EditText) findViewById(R.id.editText);
                Toast toast = Toast.makeText(MainActivity.this, "B10509002" + editText.getText(), Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}