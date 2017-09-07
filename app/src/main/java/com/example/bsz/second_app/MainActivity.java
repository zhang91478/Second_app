package com.example.bsz.second_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,ActivityOne.class);
                EditText editText = (EditText)findViewById(R.id.EditText1);
                String user = editText.getText().toString();
                intent.putExtra("email",user);
                startActivityForResult(intent,0);//设置注册的请求码为0
                editText.setText("");//清空输入框
                editText = (EditText)findViewById(R.id.EditText2);
                editText.setText("");//清空输入框
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==0&&resultCode==0){
            TextView textView = (TextView) findViewById(R.id.TextView1);
            textView.setText("您已经注册成功！");
            String str=data.getStringExtra("result");
            Toast.makeText(this,str,Toast.LENGTH_LONG).show();
        }
    }
}
