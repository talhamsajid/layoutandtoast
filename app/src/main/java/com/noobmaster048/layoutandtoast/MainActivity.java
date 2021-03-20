package com.noobmaster048.layoutandtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       btn  = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Toast toast_1 =   Toast.makeText(MainActivity.this, "This is a First Toast Message", Toast.LENGTH_SHORT);
             View view  = toast_1.getView();
                view.getBackground().setColorFilter(Color.parseColor("#210070"), PorterDuff.Mode.SRC_IN);
                TextView text = view.findViewById(android.R.id.message);
                text.setTextColor(Color.parseColor("#fffeee"));
                toast_1.show();

                Toast toast_2 =   Toast.makeText(MainActivity.this, "This is a Second Toast Message", Toast.LENGTH_LONG);
                view  = toast_2.getView();
                view.getBackground().setColorFilter(Color.parseColor("#210070"), PorterDuff.Mode.SRC_IN);
                 text = view.findViewById(android.R.id.message);
                text.setTextColor(Color.parseColor("#fffeee"));
                toast_2.show();
            }
        });
    }
}