package com.hodalapp.userforms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//create connection on NewAcount
    TextView createnewAccount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createnewAccount = findViewById(R.id.NewAcount);

        createnewAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivities(new Intent[]{new  Intent(getApplicationContext(), RegistrationForm.class)});
            }
        });
    }
}