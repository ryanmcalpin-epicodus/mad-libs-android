package com.example.guest.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.goButton) Button mButton;
    @Bind(R.id.foreignCountry) EditText mForeignCountry;
    @Bind(R.id.adverb1) EditText mAdverb1;
    @Bind(R.id.adjective1) EditText mAdjective1;
    @Bind(R.id.animal) EditText mAnimal;
    @Bind(R.id.verbing1) EditText mVerbing1;
    @Bind(R.id.verb1) EditText mVerb1;
    @Bind(R.id.verbing2) EditText mVerbing2;
    @Bind(R.id.adverb2) EditText mAdverb2;
    @Bind(R.id.adjective2) EditText mAdjective2;
    @Bind(R.id.place) EditText mPlace;
    @Bind(R.id.liquid) EditText mLiquid;
    @Bind(R.id.body) EditText mBody;
    @Bind(R.id.verb2) EditText mVerb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String foreignCountry = mForeignCountry.getText().toString();
                String adverb1 = mAdverb1.getText().toString();
                String adjective1 = mAdjective1.getText().toString();
                String animal = mAnimal.getText().toString();
                String verbing1 = mVerbing1.getText().toString();
                String verb1 = mVerb1.getText().toString();
                String verbing2 = mVerbing2.getText().toString();
                String adverb2 = mAdverb2.getText().toString();
                String adjective2 = mAdjective2.getText().toString();
                String place = mPlace.getText().toString();
                String liquid = mLiquid.getText().toString();
                String body = mBody.getText().toString();
                String verb2 = mVerb2.getText().toString();
                Intent intent = new Intent(MainActivity.this, MadLibActivity.class);

                String[] answers = {foreignCountry, adverb1, adjective1, animal, verbing1, verb1, verbing2, adverb2, adjective2, place, liquid, body, verb2};
                intent.putExtra("answers", answers);
                startActivity(intent);
            }
        });
    }
}
