package com.example.homework4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    //Declaration
    TextView tv1,tv2;
    SharedPreferences sp2;
    String s1,s2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        sp2 = getSharedPreferences("editData",MODE_PRIVATE);
    }

    public void GetData(View view) {
        tv1.setText(sp2.getString("dataOne",s1));
        tv2.setText(sp2.getString("dataTwo",s2));
    }
}