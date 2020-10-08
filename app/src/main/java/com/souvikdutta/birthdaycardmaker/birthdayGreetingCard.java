package com.souvikdutta.birthdaycardmaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class birthdayGreetingCard extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday_greeting_card);
        Intent intent = getIntent();
        textView = findViewById(R.id.birthdayName);
        String name = intent.getStringExtra("MSG");
        textView.setText("Happy Birthday\n"+name);
    }
}