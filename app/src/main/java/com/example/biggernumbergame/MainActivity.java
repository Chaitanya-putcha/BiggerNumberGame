package com.example.biggernumbergame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button left_button;
    Button right_button;
    ConstraintLayout main_layout;
    Random random = new Random();
    int n1;
    int n2;
    int correct;
    int incorrect;
    TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        left_button = (Button) findViewById(R.id.button2);
        right_button = (Button) findViewById(R.id.button3);
        main_layout = (ConstraintLayout) findViewById(R.id.layout);
        t1 = (TextView)findViewById(R.id.textView2);
        t2 = (TextView)findViewById(R.id.textView5);
        n1 = random.nextInt(100);
        n2 = random.nextInt(100);
        left_button.setText("" + n1);
        right_button.setText("" + n2);

            left_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                        if (n1 > n2) {
                            main_layout.setBackgroundColor(Color.GREEN);
                            correct++;
                           t1.setText("Correct: "+correct);
                        } else {
                            main_layout.setBackgroundColor(Color.RED);
                            incorrect++;
                            t2.setText("Incorrect: "+incorrect);
                        }
                    n1 = random.nextInt(100);
                    left_button.setText("" + n1);
                    n2 = random.nextInt(100);
                    right_button.setText("" + n2);
                }
            });

            right_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (n2 > n1) {
                        main_layout.setBackgroundColor(Color.GREEN);
                        correct++;
                        t1.setText("Correct: "+correct);
                    } else {
                        main_layout.setBackgroundColor(Color.RED);
                        incorrect++;
                        t2.setText("Incorrect: "+incorrect);
                    }
                    n2 = random.nextInt(100);
                    right_button.setText("" + n2);
                    n1 = random.nextInt(100);
                    left_button.setText("" + n1);
                }
            });
    }
}