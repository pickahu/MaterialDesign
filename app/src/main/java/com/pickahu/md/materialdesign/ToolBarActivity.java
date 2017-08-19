package com.pickahu.md.materialdesign;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;


public class ToolBarActivity extends BaseActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);
        toolbar = (Toolbar) findViewById(R.id.tool_bar);

        //设置NavigationIcon
        toolbar.setNavigationIcon(R.drawable.menu);
        // 设置navigation button 点击事件
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        // 设置 toolbar 背景色
        toolbar.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        // 设置 Title
        toolbar.setTitle("我是标题");
        //  设置Toolbar title文字颜色
        toolbar.setTitleTextColor(Color.WHITE);
        // 设置Toolbar subTitle
        toolbar.setSubtitle("我是子标题");

        toolbar.setSubtitleTextColor(Color.BLACK);
        // 设置logo
        toolbar.setLogo(R.drawable.logo);
        // 设置 NavigationIcon 点击事件
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        //设置 Toolbar menu
        toolbar.inflateMenu(R.menu.menu);
        // 设置溢出菜单的图标
        toolbar.setOverflowIcon(getResources().getDrawable(R.drawable.ic_action_overflow));
        // 设置menu item 点击事件
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.item1:
                        showToast("Item1");
                        break;
                    case R.id.item2:
                        showToast("Item2");
                        break;
                }
                return false;
            }
        });
    }
}
