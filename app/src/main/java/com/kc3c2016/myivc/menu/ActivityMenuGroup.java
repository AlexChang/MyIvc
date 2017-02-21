package com.kc3c2016.myivc.menu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.kc3c2016.myivc.R;
import com.kc3c2016.myivc.activity.MainActivity;
import com.kc3c2016.myivc.activity.ControlActivity;

/**
 * Created by AlexChang on 2016/12/14.
 * 建立通用菜单项
 */

public class ActivityMenuGroup extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        Intent intent = new Intent();

        //noinspection SimplifiableIfStatement
        switch (id)
        {
            case R.id.action_main:
                Toast.makeText(getApplicationContext(), R.string.action_main, Toast.LENGTH_SHORT).show();
                intent.setClass(this, MainActivity.class);
                this.startActivity(intent);
                break;
            case R.id.action_buttonControl:
                Toast.makeText(getApplicationContext(), R.string.action_Control, Toast.LENGTH_SHORT).show();
                intent.setClass(this, ControlActivity.class);
                this.startActivity(intent);
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
