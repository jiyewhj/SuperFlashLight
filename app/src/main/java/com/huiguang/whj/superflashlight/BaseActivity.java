package com.huiguang.whj.superflashlight;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created by Administrator on 2016/5/18.
 */
public class BaseActivity extends Activity {
    protected ImageView mImageViewFlashlight;
    protected ImageView mImageViewFlashlightController;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageViewFlashlight = (ImageView) findViewById(R.id.imageView_flashlight);
        mImageViewFlashlightController = (ImageView) findViewById(R.id.imageView_flashlight_controller);
    }
}
