package com.example.mylibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by zhangyue on 2019/11/28.
 */

public class TestSdkActivity {

    public void ToastTest(Context context) {
        Toast.makeText(context, "测试", Toast.LENGTH_LONG).show();
    }

}
