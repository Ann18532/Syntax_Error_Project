package com.example.calcit;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity implements View.OnClickListener{
    TextView textview2;
    TextView textview3;
    TextView textview4;
    Button button26;
    Button button28;
    Button button29;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        button26= findViewById(R.id.button26);
        button26.setOnClickListener(this);
        button28= findViewById(R.id.button28);
        button28.setOnClickListener(this);
        button29= findViewById(R.id.button29);
        button29.setOnClickListener(this);
        Button button34=(Button) findViewById(R.id.button34);
        button34.setOnClickListener(this);
        Button button36=(Button) findViewById(R.id.button36);
        button36.setOnClickListener(this);
        Button button37=(Button) findViewById(R.id.button37);
        button37.setOnClickListener(this);
        Button button38=(Button) findViewById(R.id.button38);
        button38.setOnClickListener(this);
        Button button39=(Button) findViewById(R.id.button39);
        button39.setOnClickListener(this);
        Button button40=(Button) findViewById(R.id.button40);
        button40.setOnClickListener(this);
        Button button41=(Button) findViewById(R.id.button41);
        button41.setOnClickListener(this);
        Button button42=(Button) findViewById(R.id.button42);
        button42.setOnClickListener(this);
        Button button43=(Button) findViewById(R.id.button43);
        button43.setOnClickListener(this);
        Button button44=(Button) findViewById(R.id.button44);
        button44.setOnClickListener(this);
        Button button45=(Button) findViewById(R.id.button45);
        button45.setOnClickListener(this);
        Button button46=(Button) findViewById(R.id.button46);
        button46.setOnClickListener(this);
        Button button47=(Button) findViewById(R.id.button47);
        button47.setOnClickListener(this);
        Button button48=(Button) findViewById(R.id.button48);
        button48.setOnClickListener(this);
        textview2=findViewById(R.id.textview2);
        textview3=findViewById(R.id.textview3);
        textview4=findViewById(R.id.textview4);

    }
    int abc=0;
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button26:
                textview2.setText("1");
                textview3.setText("1000");
                textview4.setText("1000000");
                button26.setBackgroundColor(Color.parseColor("#5A5A5A"));
                button28.setBackgroundColor(Color.parseColor("#4831D4"));
                button29.setBackgroundColor(Color.parseColor("#4831D4"));
                abc = 2;
                break;
            case R.id.button28:
                textview2.setText("0.001");
                textview3.setText("1");
                textview4.setText("1000");
                abc = 3;
                button28.setBackgroundColor(Color.parseColor("#5A5A5A"));
                button26.setBackgroundColor(Color.parseColor("#4831D4"));
                button29.setBackgroundColor(Color.parseColor("#4831D4"));
                break;
            case R.id.button29:
                textview2.setText("0.000001");
                textview3.setText("0.001");
                textview4.setText("1");
                button29.setBackgroundColor(Color.parseColor("#5A5A5A"));
                button28.setBackgroundColor(Color.parseColor("#4831D4"));
                button26.setBackgroundColor(Color.parseColor("#4831D4"));
                abc = 4;
                break;
        }
        if(abc==2) {
            switch (v.getId()) {
                case R.id.button34:
                    String aa = textview2.getText().toString();
                    aa = aa + '7';
                    textview2.setText(aa);
                    break;
                case R.id.button36:
                    String a = textview2.getText().toString();
                    textview2.setText(a + "4");
                    break;
                case R.id.button37:
                    String b = textview2.getText().toString();
                    textview2.setText(b + "1");
                    break;
                case R.id.button38:
                    String c = textview2.getText().toString();
                    textview3.setText(c.valueOf(1000 * Double.parseDouble(c)));
                    textview4.setText(c.valueOf(1000000 * Double.parseDouble(c)));
                    break;
                case R.id.button39:
                    String d = textview2.getText().toString();
                    textview2.setText(d + "8");
                    break;
                case R.id.button40:
                    String e = textview2.getText().toString();
                    textview2.setText(e + "5");
                    break;
                case R.id.button41:
                    String f = textview2.getText().toString();
                    textview2.setText(f + "2");
                    break;
                case R.id.button42:
                    String g = textview2.getText().toString();
                    textview2.setText(g + "0");
                    break;
                case R.id.button43:
                    String h = textview2.getText().toString();
                    textview2.setText(h + "9");
                    break;
                case R.id.button44:
                    String i = textview2.getText().toString();
                    textview2.setText(i + "6");
                    break;
                case R.id.button45:
                    String j = textview2.getText().toString();
                    textview2.setText(j + "3");
                    break;
                case R.id.button46:
                    String k = textview2.getText().toString();
                    textview2.setText(k + ".");
                    break;
                case R.id.button47:
                    textview2.setText("");
                    break;
                case R.id.button48:
                    String l = textview2.getText().toString();
                    textview2.setText(l.substring(0, l.length() - 1));
                    break;
            }
        }
        if(abc==3) {
            switch (v.getId()) {
                case R.id.button34:
                    String aa = textview3.getText().toString();
                    textview3.setText(aa + "7");
                    break;
                case R.id.button36:
                    String a = textview3.getText().toString();
                    textview3.setText(a + "4");
                    break;
                case R.id.button37:
                    String b = textview3.getText().toString();
                    textview3.setText(b + "1");
                    break;
                case R.id.button38:
                    String c = textview3.getText().toString();
                    textview2.setText(c.valueOf(0.001 * Double.parseDouble(c)));
                    textview4.setText(c.valueOf(1000 * Double.parseDouble(c)));
                    break;
                case R.id.button39:
                    String d = textview3.getText().toString();
                    textview3.setText(d + "8");
                    break;
                case R.id.button40:
                    String e = textview3.getText().toString();
                    textview3.setText(e + "5");
                    break;
                case R.id.button41:
                    String f = textview3.getText().toString();
                    textview3.setText(f + "2");
                    break;
                case R.id.button42:
                    String g = textview3.getText().toString();
                    textview3.setText(g + "0");
                    break;
                case R.id.button43:
                    String h = textview3.getText().toString();
                    textview3.setText(h + "9");
                    break;
                case R.id.button44:
                    String i = textview3.getText().toString();
                    textview3.setText(i + "6");
                    break;
                case R.id.button45:
                    String j = textview3.getText().toString();
                    textview3.setText(j + "3");
                    break;
                case R.id.button46:
                    String k = textview3.getText().toString();
                    textview3.setText(k + ".");
                    break;
                case R.id.button47:
                    textview3.setText("");
                    break;
                case R.id.button48:
                    String l = textview3.getText().toString();
                    textview3.setText(l.substring(0, l.length() - 1));
                    break;
            }
        }
        if(abc==4) {
            switch (v.getId()) {
                case R.id.button34:
                    String aa = textview4.getText().toString();
                    textview4.setText(aa + "7");
                    break;
                case R.id.button36:
                    String a = textview4.getText().toString();
                    textview4.setText(a + "4");
                    break;
                case R.id.button37:
                    String b = textview4.getText().toString();
                    textview4.setText(b + "1");
                    break;
                case R.id.button38:
                    String c = textview4.getText().toString();
                    textview2.setText(c.valueOf(0.000001 * Double.parseDouble(c)));
                    textview3.setText(c.valueOf(0.001 * Double.parseDouble(c)));
                    break;
                case R.id.button39:
                    String d = textview4.getText().toString();
                    textview4.setText(d + "8");
                    break;
                case R.id.button40:
                    String e = textview4.getText().toString();
                    textview4.setText(e + "5");
                    break;
                case R.id.button41:
                    String f = textview4.getText().toString();
                    textview4.setText(f + "2");
                    break;
                case R.id.button42:
                    String g = textview4.getText().toString();
                    textview4.setText(g + "0");
                    break;
                case R.id.button43:
                    String h = textview4.getText().toString();
                    textview4.setText(h + "9");
                    break;
                case R.id.button44:
                    String i = textview4.getText().toString();
                    textview4.setText(i + "6");
                    break;
                case R.id.button45:
                    String j = textview4.getText().toString();
                    textview4.setText(j + "3");
                    break;
                case R.id.button46:
                    String k = textview4.getText().toString();
                    textview4.setText(k + ".");
                    break;
                case R.id.button47:
                    textview4.setText("");
                    break;
                case R.id.button48:
                    String l = textview4.getText().toString();
                    textview4.setText(l.substring(0, l.length() - 1));
                    break;
            }
        }
        }
    }

