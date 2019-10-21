package cn.edu.hstc.myitent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1=findViewById(R.id.browser);
        Button button2=findViewById(R.id.map);
        Button button3=findViewById(R.id.dialing);
        ///////浏览器
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse("http://www.google.com"));
                startActivity(intent1);
            }
        });
        ///////地图
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(Intent.ACTION_VIEW);
                intent2.setData(Uri.parse("geo:38.899533,-77.036476"));
                startActivity(intent2);
            }
        });
        ////////拨号
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3=new Intent(Intent.ACTION_DIAL);
                intent3.setData(Uri.parse("tel:10086"));
                startActivity(intent3);
            }
        });

    }
}
