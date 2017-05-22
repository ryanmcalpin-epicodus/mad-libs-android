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

        String foreignCountry = intent.getStringExtra("foreignCountry");
        String adverb1 = intent.getStringExtra("adverb1");
        String adjective1 = intent.getStringExtra("adjective1");
        String animal = intent.getStringExtra("animal");
        String verbing1 = intent.getStringExtra("verbing1");
        String verb1 = intent.getStringExtra("verb1");
        String verbing2 = intent.getStringExtra("verbing2");
        String adverb2 = intent.getStringExtra("adverb2");
        String adjective2 = intent.getStringExtra("adjective2");
        String place = intent.getStringExtra("place");
        String liquid = intent.getStringExtra("liquid");
        String body = intent.getStringExtra("body");
        String verb2 = intent.getStringExtra("verb2");

        String result = String.format("If you are traveling in %s and find yourself having to cross a piranha-filled river, here's how to do it %s:\nPiranhas are more %s during the day, so cross the river at night.\nAvoid areas with netted %s traps--piranhas may be %s there looking to %s them!\nWhen %s the river, swim %s. You don't want to wake them up and make them %s!\nWhatever you do, if you have an open wound, try to find another way to get back to the %s. Piranhas are attracted to fresh %s and will most likely take a bite out of your %s if you %s in the water!", foreignCountry, adverb1, adjective1, animal, verbing1, verb1, verbing2, adverb2, adjective2, place, liquid, body, verb2);

        mResultView.setText(result);
    }
}
