package cn.edu.hstc.activitymodel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity  implements  View.OnClickListener{

    private final static String TAG = "ThirdActivity";

    public void onClick(View v) {
        Intent intent;
        if (v.getId() == R.id.button) {
            intent = new Intent(ThirdActivity.this, MainActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.button1) {
            intent = new Intent(ThirdActivity.this, FirstActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.button2) {
            intent = new Intent(ThirdActivity.this, SecondActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.button3) {
            intent = new Intent(ThirdActivity.this, ThirdActivity.class);
            startActivity(intent);
        }
    }
    public void settupButton(){
        Button b;
        b = (Button) findViewById(R.id.button);
        b.setOnClickListener(this);
        b = (Button) findViewById(R.id.button1);
        b.setOnClickListener(this);
        b = (Button) findViewById(R.id.button2);
        b.setOnClickListener(this);
        b = (Button) findViewById(R.id.button3);
        b.setOnClickListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        setTitle("ThirdActivity");
        Log.d(TAG, this.toString());
        settupButton();
    }
}
