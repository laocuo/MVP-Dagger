package com.test.testapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MainContract.View{

    @Inject
    MainPresenter mMainPresenter;

    @Inject
    MainBean mMainBean;

    @Inject
    MainContract.View mContractView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.intentbutton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setPackage("com.google.android.gms");
                intent.setAction("com.google.android.gms.accountsettings.action.VIEW_SETTINGS");
                startActivity(intent);
            }
        });

        DaggerMainComponent.builder()
                .mainModule(new MainModule(this))
                .build()
                .inject(this);
    }

    @Override
    public void showText() {

    }
}
