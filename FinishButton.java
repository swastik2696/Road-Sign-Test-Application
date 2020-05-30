package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FinishButton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish_button);

        TextView ResultView = findViewById(R.id.ResultView);

        RoadSign_Quiz obj = new RoadSign_Quiz();

        ResultView.setText("Your Score: " + obj.getScoreCounter() + "/8");

    }
}
