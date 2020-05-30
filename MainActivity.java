package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static RoadSignQuestions Answer1 = new RoadSignQuestions(R.drawable.oneway, "One Way", "Stop", "Turn Left", "Reduce Speed", "One Way");
    public static RoadSignQuestions Answer2 = new RoadSignQuestions(R.drawable.windingroad, "Roundabout Ahead", "Winding Road", "Turn Left", "Reduce Speed", "Winding Road");
    public static RoadSignQuestions Answer3 = new RoadSignQuestions(R.drawable.twolanereversecurve, "Turn Right", "Stop", "Two Lane Reverse Curve", "Reduce Speed", "Two Lane Reverse Curve");
    public static RoadSignQuestions Answer4 = new RoadSignQuestions(R.drawable.doublereversecurve, "Turn Left", "Roundabout Ahead", "Winding Road", "Double Reverse Curve (3 Lane)", "Double Reverse Curve (3 Lane)");
    public static RoadSignQuestions Answer5 = new RoadSignQuestions(R.drawable.pedestriancrossing, "Turn Right", "Animals Ahead", "Pedestrian Crossing", "Double Reverse Curve (3 Lane)", "Pedestrian Crossing");
    public static RoadSignQuestions Answer6 = new RoadSignQuestions(R.drawable.roundabout, "Stop", "Roundabout Ahead", "Winding Road", "Reduce Speed", "Roundabout Ahead");
    public static RoadSignQuestions Answer7 = new RoadSignQuestions(R.drawable.shoulderdropoff, "No Entry", "One Way", "Winding Road", "Shoulder Drop Off", "Shoulder Drop Off");
    public static RoadSignQuestions Answer8 = new RoadSignQuestions(R.drawable.turningvehinclesyieldtopedestrians, "Turning Vehicles Yield to Pedestrians", "Roundabout Ahead", "Double Reverse Curve (3 Lane)", "Accident Zone", "Turning Vehicles Yield to Pedestrians");

    public static ArrayList<RoadSignQuestions> AnswerList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager vpPager = findViewById(R.id.vpPager);
        vpPager.setVisibility(View.GONE);
        MyPagerAdapter adapterViewPager = new MyPagerAdapter(getSupportFragmentManager());
        vpPager.setAdapter(adapterViewPager);
        vpPager.setVisibility(View.VISIBLE);

        AnswerList.add(Answer1);
        AnswerList.add(Answer2);
        AnswerList.add(Answer3);
        AnswerList.add(Answer4);
        AnswerList.add(Answer5);
        AnswerList.add(Answer6);
        AnswerList.add(Answer7);
        AnswerList.add(Answer8);

    }
}

