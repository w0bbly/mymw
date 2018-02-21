package com.example.joaopimentel.mymw;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.view.animation.Animation;
public class IntroActivity extends AppCompatActivity {

    TextView appManage;
    TextView appYour;
    TextView appMoney;
    TextView appWisely;
    TextView creatorName;
    Animation fadeInAnimation;

    Animation fadeInAnimation() {
        fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fadein);
        return fadeInAnimation;
    }

    void changeFontsOfText() {
        appManage = findViewById(R.id.app_manage);
        appMoney = findViewById(R.id.app_money);
        appYour = findViewById(R.id.app_your);
        appWisely = findViewById(R.id.app_wisely);
        creatorName = findViewById(R.id.creator_name);

        Typeface custom_font = Typeface.createFromAsset(getAssets(),"fonts/alphabetized_cassette_tapes.ttf");

        appManage.setTypeface(custom_font);
        appYour.setTypeface(custom_font);
        appMoney.setTypeface(custom_font);
        appWisely.setTypeface(custom_font);
        creatorName.setTypeface(custom_font);
    }

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        changeFontsOfText();
        appManage.startAnimation(fadeInAnimation());
        appYour.startAnimation(fadeInAnimation());
        appMoney.startAnimation(fadeInAnimation());
        appWisely.startAnimation(fadeInAnimation());
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
    }
}
