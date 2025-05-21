package com.example.georgieass;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class ThirdActivity extends AppCompatActivity implements View.OnClickListener {
    Button start_button;
    Button reset2_button;
    Button back_button2;
    TextView timer_button;
    Boolean pause = true;
    int count_in_seconds = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_layout_main);
        Intent intent = new Intent(this, ThirdActivity.class);

       back_button2 = findViewById(R.id.back_button2);
       back_button2.setOnClickListener(this);

        start_button = findViewById(R.id.start_button);
        reset2_button = findViewById(R.id.reset2_button);

        start_button.setOnClickListener(ThirdActivity.this);
        reset2_button.setOnClickListener(ThirdActivity.this);

        timer_button = findViewById(R.id.timer_button);

        set_up_timer();

    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.start_button) {

            if(pause){
                pause = false;
            }else {
                pause = true;
            }

        } else if (v.getId() == R.id.reset2_button) {
           count_in_seconds = 0;
           timer_button.setText(Integer.toString(count_in_seconds));
        } else if (v.getId() == R.id.back_button2) {
            finish();
        }

    }

    public void set_up_timer() {
        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            int count_in_seconds = 0;

            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if (!pause) {
                            count_in_seconds = count_in_seconds + 1;
                            timer_button.setText(Integer.toString(count_in_seconds));
                        }


                    }

                });
            }
        }, 0, 1000);
    }

}