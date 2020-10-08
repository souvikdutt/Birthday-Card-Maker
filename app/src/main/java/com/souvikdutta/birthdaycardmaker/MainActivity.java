package com.souvikdutta.birthdaycardmaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String MSG = "com.souvikdutta.birthdaycardmaker.NAME";

    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.writeName);
    }


    public void generateCard(View view) {
        String val = editText.getEditableText().toString();
        Toast.makeText(this,"Name is "+val,Toast.LENGTH_LONG).show();

        Intent intent = new Intent(this,birthdayGreetingCard.class);
        intent.putExtra("MSG",val);
        startActivity(intent);
    }
}