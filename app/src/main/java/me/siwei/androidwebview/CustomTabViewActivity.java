package me.siwei.androidwebview;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;

public class CustomTabViewActivity extends AppCompatActivity {

    // 要打开的URL
//    public String URL = "http://h5.touring.com.cn/#!/addresses?uuid=oKB7ww_FSqOs1H9elPWOmGBBCRHM&client=android";
    public String URL = "http://h5.touring.com.cn/interface/airport_guides?airport_manager_id=6";
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_web_view);
        Log.d("CustomTabViewActivity", "hihihi ");

        WebView web_view = new WebView(this);

        web_view.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT ));

        
        LinearLayout layout = (LinearLayout)findViewById(R.id.my_web_view_layout);
        layout.addView(web_view);

        web_view.loadUrl(URL);

    }
}

