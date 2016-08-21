package me.siwei.androidwebview;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        RelativeLayout layout = (RelativeLayout)findViewById(R.id.the_layout);

        Button hi_button = new Button(this);
        hi_button.setText("click to open url");
        hi_button.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT  ));
        hi_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.d("MainActivity", "clicked me!");
                Intent intent = new Intent(MainActivity.this, MyWebViewActivity.class);
                intent.putExtra("url", "http://h5.touring.com.cn/hi.html");
                startActivity(intent);
            }
        });


        layout.addView(hi_button);

    }
}
