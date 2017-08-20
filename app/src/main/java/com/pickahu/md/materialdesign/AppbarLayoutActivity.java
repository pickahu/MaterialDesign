package com.pickahu.md.materialdesign;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.util.Log;
import android.view.View;


public class AppbarLayoutActivity extends BaseActivity implements View.OnClickListener{

    private final static String TAG = "AppbarLayoutActivity";
    private AppBarLayout mAppBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appbar_layout);

        mAppBar = (AppBarLayout) findViewById(R.id.app_bar);
        mAppBar.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                Log.e(TAG, "verticalOffset" + verticalOffset);
            }
        });

        findViewById(R.id.btn_open).setOnClickListener(this);
        findViewById(R.id.btn_close).setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_open){
            mAppBar.setExpanded(true);
        }

        if(v.getId() == R.id.btn_close){
            mAppBar.setExpanded(false);
        }
    }
}
