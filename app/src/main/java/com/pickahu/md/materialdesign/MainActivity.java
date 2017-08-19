package com.pickahu.md.materialdesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_toolbar).setOnClickListener(this);
        findViewById(R.id.btn_toolbar_custom).setOnClickListener(this);
        findViewById(R.id.btn_appbarlayout).setOnClickListener(this);
        findViewById(R.id.btn_coordinator_layout).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btn_toolbar:
                startActivity(new Intent(MainActivity.this, ToolBarActivity.class));
                break;
            case R.id.btn_toolbar_custom:
                startActivity(new Intent(MainActivity.this, ToolBarCustomActivity.class));
                break;
            case R.id.btn_coordinator_layout:
                startActivity(new Intent(MainActivity.this, CoordinatorLayoutActivity.class));
                break;
            case R.id.btn_appbarlayout:
                startActivity(new Intent(MainActivity.this, AppbarLayoutActivity.class));
                break;
        }
    }
}
