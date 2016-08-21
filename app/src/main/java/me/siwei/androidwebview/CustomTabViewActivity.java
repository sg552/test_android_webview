package me.siwei.androidwebview;

import android.content.Context;
import android.os.Bundle;
import android.support.customtabs.CustomTabsIntent;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;

import org.chromium.customtabsclient.shared.CustomTabActivityHelper;
import android.net.Uri;

public class CustomTabViewActivity extends AppCompatActivity {

    // 要打开的URL
//    public String URL = "http://h5.touring.com.cn/#!/addresses?uuid=oKB7ww_FSqOs1H9elPWOmGBBCRHM&client=android";
    public String URL = "http://h5.touring.com.cn/interface/airport_guides?airport_manager_id=6";
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_web_view);
        Log.d("CustomTabViewActivity", "== in CustomTabViewActivity ");

//        CustomTabsIntent custom_tabs_intent = new CustomTabsIntent.Builder().build();
//        Log.d("CustomTabViewActivity", "开始打开webview啦, now using custom tab view: ");
//        CustomTabActivityHelper.openCustomTab(this, custom_tabs_intent, Uri.parse(URL), new WebviewFallback());

        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        CustomTabsIntent customTabsIntent = builder.build();
        customTabsIntent.launchUrl(this, Uri.parse(URL));
    }
}

