package com.huiguang.whj.superflashlight;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Administrator on 2016/5/18.
 */
public class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
