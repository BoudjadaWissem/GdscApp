package com.example.gdscapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {
ImageView LOGO;
TextView Text1,Text2;

Animation top_ani,center_ani,bottom_ani;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        LOGO=findViewById(R.id.logo);
        Text1=findViewById(R.id.text1);
        Text2=findViewById(R.id.text2);

        top_ani= AnimationUtils.loadAnimation(this,R.anim.topanim);
        center_ani= AnimationUtils.loadAnimation(this,R.anim.centeranim);
        bottom_ani= AnimationUtils.loadAnimation(this,R.anim.bottomanim);

        LOGO.setAnimation(center_ani);
        Text1.setAnimation(bottom_ani);
        Text2.setAnimation(bottom_ani);




    }
}