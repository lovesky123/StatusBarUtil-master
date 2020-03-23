package com.leaf.statusbarutil;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.leaf.library.StatusBarUtil;

public class TransparentActivity extends AppCompatActivity {
    private boolean isChanged;

    @Override
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_transparent);
       //TODO 状态栏
        StatusBarUtil.setTransparentForWindow(this);

        Button btn = findViewById(R.id.button1);
        RelativeLayout relativeLayout = findViewById(R.id.container);

        btn.setOnClickListener(v -> {
            isChanged = !isChanged;
            if (isChanged) {
                relativeLayout.setBackground(AppUtils.getDrawable(R.mipmap.photo6));
            } else {
                relativeLayout.setBackground(AppUtils.getDrawable(R.mipmap.photo5));
            }
        });

    }
}
