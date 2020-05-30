package com.example.fragments;

public class RoadSignQuestions {

    private int  img;
    private String Answer1;
    private String Answer2;
    private String Answer3;
    private String Answer4;
    private String CorrectAnswer;

    public RoadSignQuestions(int img, String Answer1, String Answer2, String Answer3, String Answer4, String CorrectAnswer) {

        this.img = img;
        this.Answer1 = Answer1;
        this.Answer2 = Answer2;
        this.Answer3 = Answer3;
        this.Answer4 = Answer4;
        this.CorrectAnswer = CorrectAnswer;

    }

    public String getAnswer1() {
        return Answer1;
    }

    public String getAnswer2() {
        return Answer2;
    }

    public String getAnswer3() {
        return Answer3;
    }

    public String getAnswer4() {
        return Answer4;
    }

    public String getCorrectAnswer() { return CorrectAnswer; }

    public int getImg() {
        return img;
    }


}
