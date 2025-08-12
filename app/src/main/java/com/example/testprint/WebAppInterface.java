package com.example.testprint;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

public class WebAppInterface {
    Context mContext;

    public WebAppInterface(Context context) {
        mContext = context;
    }

    @JavascriptInterface
    public void triggerPrint() {
        // Here you can call Android's PrintManager or your printer SDK
        Toast.makeText(mContext, "krelian r quimson", Toast.LENGTH_SHORT).show();
    }
}
