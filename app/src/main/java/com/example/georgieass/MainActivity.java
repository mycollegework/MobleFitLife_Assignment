package com.example.georgieass;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    Button next_screen;
    EditText change_button;
    Button reset_button;
    Button nextpage_button;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        next_screen = findViewById(R.id.next_screen);
        textView = findViewById(R.id.textView);
        change_button = findViewById(R.id.change_button);
        reset_button = findViewById(R.id.reset_button);
        nextpage_button = findViewById(R.id.nextpage_button);

        next_screen.setOnClickListener(this);
        reset_button.setOnClickListener(this);
        nextpage_button.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.next_screen) {
            textView.setText(change_button.getText());
        } else if (view.getId() == R.id.reset_button) {
            textView.setText("Hello World!");
        }
        if (view.getId() == R.id.nextpage_button) {
            Toast.makeText(this, "Next button clicked", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        }else if (view.getId()  == R.id.reset_button){
            textView.setText("Hello World!");
        }

    }


}