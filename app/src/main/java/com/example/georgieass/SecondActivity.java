package com.example.georgieass;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    Button Next_Button;
    Button Back_Button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.second_activity_main);

        Next_Button = findViewById(R.id.Next_Button);
        Next_Button.setOnClickListener(this);

        Back_Button2 = findViewById(R.id.Back_Button_2);
        Back_Button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.Next_Button) {
            Toast.makeText(this, "Next button clicked", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, ThirdActivity.class);;
            switchActivity(intent);

        } else if (v.getId() == R.id.Back_Button_2) {
            Toast.makeText(this, "Back button clicked", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, MainActivity.class);
            switchActivity(intent);


        }
    }

    public void switchActivity(Intent switchActivityIntent) {
        startActivity(switchActivityIntent);
    }
}
