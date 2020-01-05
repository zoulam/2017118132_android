package cn.edu.hstc.service;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1=findViewById(R.id.button1);
        Button button2=findViewById(R.id.button2);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        //新增部分
        Button button3=findViewById(R.id.button3);
        Button button4=findViewById(R.id.button4);
        button3.setOnClickListener(new buttonclick(this));
        button4.setOnClickListener(new buttonclick(this));
    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent(this,HelloIntentService.class);
        switch (v.getId()){
            case R.id.button1:startService(intent);break;
            case R.id.button2:stopService(intent);break; }
    }
    //新增：此处为外部类（独立类）实现Button监听事件
    public class buttonclick implements View.OnClickListener{
        private Context context;
        public  buttonclick(Context ct){this.context=ct;}
        Intent intent=new Intent(MainActivity.this,HelloService.class);
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.button3:startService(intent);break;
                case R.id.button4:stopService(intent);break;}
        }
    }
}
