package com.yjg.demopendingintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MoreInfoActivity extends AppCompatActivity {

    private TextView tvUserId;
    private TextView tvUserName;
    private TextView tvUserInfo;
    private User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_info);

        tvUserId = (TextView) findViewById(R.id.tv_userid);
        tvUserName = (TextView) findViewById(R.id.tv_username);
        tvUserInfo = (TextView) findViewById(R.id.tv_userinfo);
    }

    @Override
    protected void onResume() {
        super.onResume();

        Intent intent = getIntent();
        if (intent == null) {
            return;
        }
        user = (User) intent.getSerializableExtra("user");
        tvUserId.setText(user.getUserId());
        tvUserName.setText(user.getUserName());
        tvUserInfo.setText(user.getUserInfo());
    }
}
