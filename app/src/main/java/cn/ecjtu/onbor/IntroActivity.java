/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package cn.ecjtu.onbor;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;


import com.github.appintro.AppIntro;
import com.github.appintro.AppIntroPageTransformerType;



public class IntroActivity extends AppIntro {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setProgressIndicator();
            setNextArrowColor(Color.parseColor("#2196F3"));
            setColorDoneText(Color.parseColor("#2196F3"));
            setSkipButtonEnabled(false);
            setTransformer(AppIntroPageTransformerType.Fade.INSTANCE);
            addSlide(new PermissionActivity());
            addSlide(new WelcomeActivity());
    }


    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        finish();
        Intent intent = new Intent(IntroActivity.this, MainActivity.class);
        startActivity(intent);
    }

}