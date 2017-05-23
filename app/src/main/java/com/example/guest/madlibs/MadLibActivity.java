package com.example.guest.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MadLibActivity extends AppCompatActivity {
    @Bind(R.id.resultView) TextView mResultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mad_lib);
        ButterKnife.bind(this);
        Intent intent = getIntent();

        String[] answers = intent.getStringArrayExtra("answers");

        String result = String.format("If you are traveling in %s and find yourself having to cross a piranha-filled river, here's how to do it %s:\nPiranhas are more %s during the day, so cross the river at night.\nAvoid areas with netted %s traps--piranhas may be %s there looking to %s them!\nWhen %s the river, swim %s. You don't want to wake them up and make them %s!\nWhatever you do, if you have an open wound, try to find another way to get back to the %s. Piranhas are attracted to fresh %s and will most likely take a bite out of your %s if you %s in the water!", answers[0], answers[1], answers[2], answers[3], answers[4], answers[5], answers[6], answers[7], answers[8], answers[9], answers[10], answers[11], answers[12]);

        mResultView.setText(result);
    }
}
