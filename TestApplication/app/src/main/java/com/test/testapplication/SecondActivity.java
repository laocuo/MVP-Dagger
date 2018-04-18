package com.test.testapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by hoperun on 4/18/18.
 */

public class SecondActivity extends AppCompatActivity implements DragCloseLayout.DragCloseListener{
    private DragCloseLayout mDragCloseLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mDragCloseLayout = findViewById(R.id.contentPanel);
        mDragCloseLayout.setDragCloseListener(this);
    }

    @Override
    public void dragclose() {
        finishAfterTransition();
    }
}
