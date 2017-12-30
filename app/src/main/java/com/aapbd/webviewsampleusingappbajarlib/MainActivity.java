package com.aapbd.webviewsampleusingappbajarlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.aapbd.appbajarlib.view.WebViewFormatter;

public class MainActivity extends AppCompatActivity {

    private WebView myWebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
    }

    private void initUI() {

        myWebview=(WebView)findViewById(R.id.mywebview);

        WebViewFormatter.formatWebViewWithClient(myWebview,true,true);

        myWebview.loadUrl("http://weeklyaraihazar.com/");


    }
}
