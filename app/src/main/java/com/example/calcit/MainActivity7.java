package com.example.calcit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity7 extends  MainActivity  {
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;
    TextView textView7;
    TextView textView8;
    TextView textView9;
    TextView textView10;
    TextView textView11;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        textView2=findViewById(R.id.textView2);
        textView3=findViewById(R.id.textView3);
        textView4=findViewById(R.id.textView4);
        textView5=findViewById(R.id.textView5);
        textView6=findViewById(R.id.textView6);
        textView7=findViewById(R.id.textView7);
        textView8=findViewById(R.id.textView8);
        textView9=findViewById(R.id.textView9);
        textView10=findViewById(R.id.textView10);
        textView11=findViewById(R.id.textView11);

        Bundle extras = getIntent().getExtras();

        if(extras != null)
        {
            int updateHistory = extras.getInt("x");
            String value = extras.getString("yy");
            String expression = extras.getString("y");

            if(updateHistory==1){
                textView2.setText(textView4.getText().toString());
                textView3.setText(textView5.getText().toString());
                textView4.setText(textView6.getText().toString());
                textView5.setText(textView7.getText().toString());
                textView6.setText(textView8.getText().toString());
                textView7.setText(textView9.getText().toString());
                String a8=textView10.getText().toString();
                textView8.setText(a8);
                String a9=textView11.getText().toString();
                textView9.setText(a9);
                textView11.setText("="+value);
                textView10.setText(expression);
            }
        }
    }

    public void back(View v){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}