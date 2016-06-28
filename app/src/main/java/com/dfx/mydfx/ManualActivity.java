package com.dfx.mydfx;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class ManualActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual);

        WebView wView = (WebView)findViewById(R.id.instruction1);
        WebSettings wSet = wView.getSettings();
        wSet.setJavaScriptEnabled(true);
        wView.loadUrl("file:///android_asset/1.html");
    }
}
