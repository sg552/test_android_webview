package me.siwei.androidwebview;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;

import java.lang.reflect.Method;

public class MyWebViewActivity extends AppCompatActivity {

    // 要打开的URL
//    public String URL = "http://h5.touring.com.cn/#!/addresses?uuid=oKB7ww_FSqOs1H9elPWOmGBBCRHM&client=android";
    public String URL = "http://h5.touring.com.cn/interface/airport_guides?airport_manager_id=6";
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_web_view);
        Log.d("MyWebViewActivity", "hihihi ");

        WebView web_view = new WebView(this);

        web_view.setLayoutParams(new LinearLayout.LayoutPara/ms(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT ));

        web_view.setFocusableInTouchMode(true);
        web_view.setFocusable(true);
        web_view.requestFocus();
//        web_view.setWebViewClient(webViewClient);
        web_view.setWebChromeClient(new WebChromeClient());
        web_view.setLayerType(View.LAYER_TYPE_HARDWARE, null); // 硬件加速渲染失败时可能导致页面空白, 使用软件渲染

        WebSettings settings = web_view.getSettings();
        web_view.getSettings().setPluginState(WebSettings.PluginState.ON);
        settings.setJavaScriptEnabled(true);
        settings.setBlockNetworkImage(false);
//        settings.setBlockNetworkLoads(true);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);//排版适应屏幕
        settings.setLoadWithOverviewMode(true);// setUseWideViewPort方法设置webview推荐使用的窗口。setL
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setDefaultTextEncodingName("UTF-8");
        settings.setDomStorageEnabled(true);
        settings.setAppCacheMaxSize(1024 * 1024 * 8);//设置缓冲大小，我设的是8M
        String appCacheDir = getApplicationContext().getDir("web_cache", Context.MODE_PRIVATE).getPath();
        settings.setAppCachePath(appCacheDir);
        settings.setAllowFileAccess(true);
        settings.setAppCacheEnabled(true);
        settings.setCacheMode(WebSettings.LOAD_DEFAULT);
        
        
        
        LinearLayout layout = (LinearLayout)findViewById(R.id.my_web_view_layout);
        layout.addView(web_view);

        web_view.loadUrl(URL);

    }
}

