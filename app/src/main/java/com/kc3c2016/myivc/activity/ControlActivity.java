package com.kc3c2016.myivc.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.kc3c2016.myivc.R;
import com.kc3c2016.myivc.menu.ActivityMenuGroup;

/**
 * Created by AlexChang on 2016/12/14.
 */

public class ControlActivity extends ActivityMenuGroup {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control);
        for (int id: new int[] {
                R.id.main_1,
                R.id.main_2,
                R.id.main_3,
                R.id.main_4,
                R.id.main_5,
                R.id.main_6,
                R.id.main_7,
                R.id.main_8,
                R.id.main_9}) {
            ((ImageButton)findViewById(id)).setOnClickListener(onDirectionClickListener);
        }
    }

    private  View.OnClickListener onDirectionClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            switch (v.getId()) {
                case R.id.main_1:
                    Toast.makeText(getApplicationContext(), R.string.action_button, Toast.LENGTH_SHORT).show();
                    intent.setClass(ControlActivity.this, ButtonActivity.class);
                    ControlActivity.this.startActivity(intent);
                    break;
                case R.id.main_2:
                    Toast.makeText(getApplicationContext(), R.string.action_gravity, Toast.LENGTH_SHORT).show();
                    intent.setClass(ControlActivity.this, GravityActivity.class);
                    ControlActivity.this.startActivity(intent);
                    break;
                case R.id.main_3:
                    Toast.makeText(getApplicationContext(), R.string.action_speech, Toast.LENGTH_SHORT).show();
                    intent.setClass(ControlActivity.this, SpeechActivity.class);
                    ControlActivity.this.startActivity(intent);
                    break;
                case R.id.main_4:
                    Toast.makeText(getApplicationContext(), R.string.action_gesture, Toast.LENGTH_SHORT).show();
                    intent.setClass(ControlActivity.this, GestureActivity.class);
                    ControlActivity.this.startActivity(intent);
                    break;
                case R.id.main_5:
                    Toast.makeText(getApplicationContext(), R.string.action_route, Toast.LENGTH_SHORT).show();
                    intent.setClass(ControlActivity.this, RouteActivity.class);
                    ControlActivity.this.startActivity(intent);
                    break;
                case R.id.main_6:
                    Toast.makeText(getApplicationContext(), R.string.action_vector, Toast.LENGTH_SHORT).show();
                    intent.setClass(ControlActivity.this, VectorActivity.class);
                    ControlActivity.this.startActivity(intent);
                    break;
                case R.id.main_7:
                    Toast.makeText(getApplicationContext(), R.string.action_follow, Toast.LENGTH_SHORT).show();
                    intent.setClass(ControlActivity.this, FollowActivity.class);
                    ControlActivity.this.startActivity(intent);
                    break;
                case R.id.main_8:
                    Toast.makeText(getApplicationContext(), R.string.action_Control, Toast.LENGTH_SHORT).show();
                    intent.setClass(ControlActivity.this, MainActivity.class);
                    ControlActivity.this.startActivity(intent);
                    break;
                case R.id.main_9:
                    Toast.makeText(getApplicationContext(), R.string.action_Control, Toast.LENGTH_SHORT).show();
                    intent.setClass(ControlActivity.this, MainActivity.class);
                    ControlActivity.this.startActivity(intent);
                    break;
            }
        }
    };
}
