package com.example.ulan.prof;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button btnnum,email1,email2,     btninf;
    TextView name;
    ImageView prof;
    Bitmap bitmap;
    RadioGroup rg;
    RadioButton rb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.glav);
        addListenerOnButton();

        rg = (RadioGroup)findViewById(R.id.radiogroup);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.firstpage) {
                    name.setText("Ulan Sadyk");
                    btnnum.setText("+7 707 25 04 996");
                    email1.setText("ulan_sadykov@mail.ru");
                    email2.setText("Aidarly");
                    //address.setText("Abay st. 163");
                    prof.setImageResource(R.drawable.prof_ulan);
                }
                if (i == R.id.secondpage) {
                    name.setText("Omirbek Madina");
                    btnnum.setText("+7 707 245 68 43");
                    email1.setText("madina_omir@mail.ru");
                    email2.setText("Altynsarin");
                    prof.setImageResource(R.drawable.prof_mad);

                }
            }
        });

        }


    private void addListenerOnButton() {
        btnnum = (Button) findViewById(R.id.btninf);
        name = (TextView) findViewById(R.id.name);
        email1 = (Button) findViewById(R.id.email1);
        email2 = (Button) findViewById(R.id.email2);
        //address = (Button)findViewById(R.id.address);
        prof = (ImageView) findViewById(R.id.imageView);
        btnnum.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        final Intent intent = new Intent("com.example.ulan.prof.MainActivity");
                        intent.putExtra("key1", name.getText());
                        intent.putExtra("key2", btnnum.getText());
                       // intent.putExtra("key3", prof.getResources().getDrawable());
                        startActivity(intent);
                    }
                }
        );
    }
}