package com.hodalapp.userforms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class RegistrationForm extends AppCompatActivity {


    //connect with AlreadHaveAnAccount

    TextView AlreadHaveAnAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_form);


        AlreadHaveAnAccount=findViewById(R.id.AlreadHaveAnAccount);

        AlreadHaveAnAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivities(new Intent[]{new  Intent(getApplicationContext(), MainActivity.class)});
            }
        });
    }
}