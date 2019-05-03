package com.example.callbacktest;

import android.util.Log;
import android.widget.TextView;

public class Teacher implements callback{
    Student student = null;

    Teacher(Student student){
        this.student = student;
    }

    public void askQuestion(){
        this.student.resolve(this);
    }
    @Override
    public void tellAnswer(int i) {
        Log.w( "tellAnswer: ", "你的答案是"+i);
    }
}
