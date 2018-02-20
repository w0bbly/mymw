package com.example.joaopimentel.mymw;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class IntroActivity extends AppCompatActivity {

    TextView appManage;
    TextView appYour;
    TextView appMoney;
    TextView appWisely;

    void changeFontsOfText() {
        appManage = findViewById(R.id.app_manage);
        appMoney = findViewById(R.id.app_money);
        appYour = findViewById(R.id.app_your);
        appWisely = findViewById(R.id.app_wisely);

        Typeface custom_font = Typeface.createFromAsset(getAssets(),"fonts/alphabetized_cassette_tapes.ttf");

        appManage.setTypeface(custom_font);
        appYour.setTypeface(custom_font);
        appMoney.setTypeface(custom_font);
        appWisely.setTypeface(custom_font);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        changeFontsOfText();
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
    }
}
