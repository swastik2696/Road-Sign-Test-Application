package com.example.fragments;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class RoadSign_Quiz extends Fragment {

    private static final String PARAM0 = "QUESTION";
    private static final String PARAM1 = "IMG";
    private static final String PARAM2 = "ANSWER1";
    private static final String PARAM3 = "ANSWER2";
    private static final String PARAM4 = "ANSWER3";
    private static final String PARAM5 = "ANSWER4";
    private static final String PARAM6 = "CorrectAnswer";

    private int Img;
    private String Question;
    private String Answer1;
    private String Answer2;
    private String Answer3;
    private String Answer4;
    private String CorrectAnswer;

    public static int ScoreCounter = 0;

    public static int getScoreCounter() {
        return ScoreCounter;
    }

    Button myAnswer1;
    Button myAnswer2;
    Button myAnswer3;
    Button myAnswer4;

    boolean i = false;

    public RoadSign_Quiz() {

    }

    public static RoadSign_Quiz newInstance(String Question, RoadSignQuestions Ans) {
        RoadSign_Quiz fragment = new RoadSign_Quiz();
        Bundle args = new Bundle();

        args.putString("PARAM0", Question);
        args.putInt("PARAM1", Ans.getImg());
        args.putString("PARAM2", Ans.getAnswer1());
        args.putString("PARAM3", Ans.getAnswer2());
        args.putString("PARAM4", Ans.getAnswer3());
        args.putString("PARAM5", Ans.getAnswer4());
        args.putString("PARAM6", Ans.getCorrectAnswer());
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {

            Question = getArguments().getString("PARAM0");
            Img = getArguments().getInt("PARAM1");
            Answer1 = getArguments().getString("PARAM2");
            Answer2 = getArguments().getString("PARAM3");
            Answer3 = getArguments().getString("PARAM4");
            Answer4 = getArguments().getString("PARAM5");
            CorrectAnswer = getArguments().getString("PARAM6");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_flag_quiz, container, false);

        TextView QuestionView = view.findViewById(R.id.QuestionView);
        ImageView RoadSign = view.findViewById(R.id.RoadSignView);
        myAnswer1 = view.findViewById(R.id.Answer1);
        myAnswer2 = view.findViewById(R.id.Answer2);
        myAnswer3 = view.findViewById(R.id.Answer3);
        myAnswer4 = view.findViewById(R.id.Answer4);
        Button FinishButton = view.findViewById(R.id.FinishButton);

        QuestionView.setText(Question);
        RoadSign.setImageResource(Img);

        myAnswer1.setText(Answer1);
        myAnswer2.setText(Answer2);
        myAnswer3.setText(Answer3);
        myAnswer4.setText(Answer4);

        myAnswer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = true;
                checkClickButton(myAnswer1);
                myAnswer1.setEnabled(false);
                myAnswer2.setEnabled(false);
                myAnswer3.setEnabled(false);
                myAnswer4.setEnabled(false);
            }
        });

        myAnswer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = true;
                checkClickButton(myAnswer2);
                myAnswer1.setEnabled(false);
                myAnswer2.setEnabled(false);
                myAnswer3.setEnabled(false);
                myAnswer4.setEnabled(false);
            }
        });

        myAnswer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = true;
                checkClickButton(myAnswer3);
                myAnswer1.setEnabled(false);
                myAnswer2.setEnabled(false);
                myAnswer3.setEnabled(false);
                myAnswer4.setEnabled(false);
            }
        });

        myAnswer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = true;
                checkClickButton(myAnswer4);
                myAnswer1.setEnabled(false);
                myAnswer2.setEnabled(false);
                myAnswer3.setEnabled(false);
                myAnswer4.setEnabled(false);
            }
        });

        if (i) {
            myAnswer1.setEnabled(false);
            myAnswer2.setEnabled(false);
            myAnswer3.setEnabled(false);
            myAnswer4.setEnabled(false);
        }

        FinishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), FinishButton.class);
                startActivity(intent);
            }
        });

        return view;
    }

    public void checkClickButton(Button btn) {

        if (btn.getText().toString().equalsIgnoreCase(CorrectAnswer)) {
            ScoreCounter++;

            Toast.makeText(getContext(), "That's Correct!", LENGTH_SHORT).show();
        }

        if (!btn.getText().toString().equalsIgnoreCase(CorrectAnswer)) {

            Toast.makeText(getContext(), "Oops, that's Incorrect!", LENGTH_SHORT).show();
        }
    }
}