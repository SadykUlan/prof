package com.example.ulan.prof;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.graphics.Bitmap;

public class glavActivity extends AppCompatActivity {
    TextView tv, number;
    ImageView prof;
    Bitmap btninf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView)findViewById(R.id.textView);
        number = (TextView)findViewById(R.id.number);
        prof = (ImageView)findViewById(R.id.imageView);

        tv.setText(getIntent().getStringExtra("key1"));
        number.setText(getIntent().getStringExtra("key2"));
        Bundle bundle = getIntent().getExtras();
        if (bundle!=null){
            int resid = bundle.getInt("key3");
            prof.setImageResource(resid);
        }

    }
}
