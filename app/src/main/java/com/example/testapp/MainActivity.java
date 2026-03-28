package com.example.testapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.graphics.Color;
import android.view.Gravity;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        TextView tv = new TextView(this);
        tv.setText("سلام! اپلیکیشن با موفقیت روی سرور گیت‌هاب ساخته شد.");
        tv.setTextSize(22);
        tv.setTextColor(Color.BLACK);
        tv.setGravity(Gravity.CENTER);
        tv.setPadding(30, 30, 30, 30);
        
        setContentView(tv);
    }
}
