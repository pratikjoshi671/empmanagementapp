package com.group.empmanagementapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login2 extends AppCompatActivity {
    EditText etUser,etPass;
    Button Btnsubmit;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUser = findViewById(R.id.editText1);
        etPass = findViewById(R.id.editText2);
        Btnsubmit = findViewById (R.id.buttonsubmit);


        Btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = etUser.getText().toString().trim();
                String pass = etPass.getText().toString().trim();
                if(user.equals("ashish")&&pass.equals("ashish12")){
                    Toast.makeText(login2.this, "Authenticated", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(login2.this,MainActivity.class);
                    startActivity(i);
                }
                else {
                    Toast.makeText(login2.this, "Denied", Toast.LENGTH_SHORT).show();

                }

            }
        });
    }
}