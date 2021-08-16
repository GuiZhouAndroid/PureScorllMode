package com.zs.itking.purescorllmode;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import com.zs.itking.purescorllmode.util.StatusBarUtil;

/**
 * 个人中心
 */
public class ProfilePracticeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_profile);

        final Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setNavigationOnClickListener(v -> finish());

        //状态栏透明和间距处理
        StatusBarUtil.immersive(this);
        StatusBarUtil.setPaddingSmart(this, toolbar);
        StatusBarUtil.setPaddingSmart(this, findViewById(R.id.profile));
        StatusBarUtil.setPaddingSmart(this, findViewById(R.id.blurView));
    }

}
