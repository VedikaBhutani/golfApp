package com.example.android.golf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int score1 = 0;
    int score2 = 0;
    int score3 = 0;
    int score4 = 0;
    int score5 = 0;
    int score6 = 0;

    public void Reset(View view) {
        score1 = 0;
        score2 = 0;
        score3 = 0;
        score4 = 0;
        score5 = 0;
        score6 = 0;
        TextView reset1 = (TextView) findViewById(R.id.textView1);
        reset1.setText(String.valueOf(0));
        TextView reset2 = (TextView) findViewById(R.id.textView2);
        reset2.setText(String.valueOf(0));
        TextView reset3 = (TextView) findViewById(R.id.textView3);
        reset3.setText(String.valueOf(0));
        TextView reset4 = (TextView) findViewById(R.id.textView4);
        reset4.setText(String.valueOf(0));
        TextView reset5 = (TextView) findViewById(R.id.textView5);
        reset5.setText(String.valueOf(0));
        TextView reset6 = (TextView) findViewById(R.id.textView6);
        reset6.setText(String.valueOf(0));
    }

    public void Add1(View view) {
        score1 = score1 + 1;
        display1(score1);
    }

    public void Add2(View view) {
        score2 = score2 + 1;
        display2(score2);
    }

    public void Add3(View view) {
        score3 = score3 + 1;
        display3(score3);
    }

    public void Add4(View view) {
        score4 = score4 + 1;
        display4(score4);
    }

    public void Add5(View view) {
        score5 = score5 + 1;
        display5(score5);
    }

    public void Add6(View view) {
        score6 = score6 + 1;
        display6(score6);
    }

    private void display1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.textView1);
        scoreView.setText(String.valueOf(score));
    }

    private void display2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.textView2);
        scoreView.setText(String.valueOf(score));
    }

    private void display3(int score) {
        TextView scoreView = (TextView) findViewById(R.id.textView3);
        scoreView.setText(String.valueOf(score));
    }

    private void display4(int score) {
        TextView scoreView = (TextView) findViewById(R.id.textView4);
        scoreView.setText(String.valueOf(score));
    }

    private void display5(int score) {
        TextView scoreView = (TextView) findViewById(R.id.textView5);
        scoreView.setText(String.valueOf(score));
    }

    private void display6(int score) {
        TextView scoreView = (TextView) findViewById(R.id.textView6);
        scoreView.setText(String.valueOf(score));
    }
}
