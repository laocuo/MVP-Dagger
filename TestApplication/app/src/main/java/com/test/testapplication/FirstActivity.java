package com.test.testapplication;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by hoperun on 4/18/18.
 */

public class FirstActivity extends AppCompatActivity implements View.OnClickListener {
    private Context mContext;
    private ImageView mImageView;
    private LinearLayout mLayout;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        mImageView = findViewById(R.id.img);
        mImageView.setOnClickListener(this);
        mContext = this;
        mLayout = findViewById(R.id.container);

        //由于SecondActivity是全屏没有状态栏的，因此FirstActivity如果有状态栏的话，必须设置statusbar不占屏幕空间，
        //让ContentView占满全屏，这样通过共享元素来回切换才能匹配
        StatusBarUtil.immersive(this);
        StatusBarUtil.setPaddingSmart(this, mLayout);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(FirstActivity.this, SecondActivity.class);
        ActivityOptionsCompat optionsCompat =
                ActivityOptionsCompat.makeSceneTransitionAnimation(FirstActivity.this, mImageView, "image");
//        ActivityOptions optionsCompat =
                ActivityOptions.makeSceneTransitionAnimation(FirstActivity.this, mImageView, "image");

        startActivity(i,optionsCompat.toBundle());
    }
}
