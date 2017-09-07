package com.example.bsz.second_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityOne extends AppCompatActivity {
    Intent intent;
    String user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        intent=getIntent();
        user = intent.getStringExtra("email");
        TextView textView = (TextView) findViewById(R.id.TextView3);
        textView.setText("您的账户为:"+user);
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.v("zhangfangzi","heiheihei1");
                intent.putExtra("result","您的账户为:"+user);
                Log.v("zhangfangzi","heiheihei2");
                setResult(0,intent);
                Log.v("zhangfangzi","heiheihei3");
                //intent.setClass(ActivityOne.this,MainActivity.class);
                //startActivity(intent);
                finish();
                Log.v("zhangfangzi","heiheihei4");
            }
        });
    }
}
