package com.example.homework4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Declaration

    EditText ed1,ed2;
    Button b1,b2;
    String s1,s2;
    SharedPreferences sp1;
    SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initialization of edittext
        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);
        //initialization of button
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);

        sp1 = getSharedPreferences("editData",MODE_PRIVATE);
        editor = sp1.edit();


    }

    public void save(View view) {

        s1 = ed1.getText().toString();
        s2 = ed2.getText().toString();
        editor.putString("dataOne",s1);
        editor.putString("dataTwo",s2);
        editor.commit();

        Toast.makeText(this,"DATA SAVED",Toast.LENGTH_SHORT).show();

    }

    public void Go(View view) {
        Intent pass = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(pass);
    }
}