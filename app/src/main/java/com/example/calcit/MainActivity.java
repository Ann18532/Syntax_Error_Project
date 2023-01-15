package com.example.calcit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textview;
    ImageButton imagebutton1;
    ImageButton imageButton2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button) findViewById(R.id.button);
        button.setOnClickListener(this);
        Button button2=(Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
        Button button3=(Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);
        Button button4=(Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);
        Button button5=(Button) findViewById(R.id.button5);
        button5.setOnClickListener(this);
        Button button6=(Button) findViewById(R.id.button6);
        button6.setOnClickListener(this);
        Button button7=(Button) findViewById(R.id.button7);
        button7.setOnClickListener(this);
        Button button8=(Button) findViewById(R.id.button8);
        button8.setOnClickListener(this);
        Button button9=(Button) findViewById(R.id.button9);
        button9.setOnClickListener(this);
        Button button10=(Button) findViewById(R.id.button10);
        button10.setOnClickListener(this);
        Button button11=(Button) findViewById(R.id.button11);
        button11.setOnClickListener(this);
        Button button12=(Button) findViewById(R.id.button12);
        button12.setOnClickListener(this);
        Button button13=(Button) findViewById(R.id.button13);
        button13.setOnClickListener(this);
        Button button14=(Button) findViewById(R.id.button14);
        button14.setOnClickListener(this);
        Button button15=(Button) findViewById(R.id.button15);
        button15.setOnClickListener(this);
        Button button16=(Button) findViewById(R.id.button16);
        button16.setOnClickListener(this);
        Button button17=(Button) findViewById(R.id.button17);
        button17.setOnClickListener(this);
        Button button18=(Button) findViewById(R.id.button18);
        button18.setOnClickListener(this);
        Button button19=(Button) findViewById(R.id.button19);
        button19.setOnClickListener(this);
        Button button20=(Button) findViewById(R.id.button20);
        button20.setOnClickListener(this);
        Button button21=(Button) findViewById(R.id.button21);
        button21.setOnClickListener(this);
        Button button22=(Button) findViewById(R.id.button22);
        button22.setOnClickListener(this);
        Button button23=(Button) findViewById(R.id.button23);
        button23.setOnClickListener(this);
        Button button24=(Button) findViewById(R.id.button24);
        button24.setOnClickListener(this);
        Button button25=(Button) findViewById(R.id.button25);
        button25.setOnClickListener(this);
        textview=findViewById(R.id.textview);
        imagebutton1=findViewById(R.id.imagebutton1);
        imageButton2=findViewById(R.id.imageButton2);
       
        imageButton2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.button3:
                textview.setText("");

                break;
            case R.id.button4:
                String a=textview.getText().toString();
                a=a.substring(0,a.length()-1);
                textview.setText(a);

                break;
            case R.id.button5:
                String b=textview.getText().toString();
                b=b+'/';
                textview.setText(b);

                break;
            case R.id.button10:
                String c=textview.getText().toString();
                c=c+'x';
                textview.setText(c);

                break;
            case R.id.button15:
                String d=textview.getText().toString();
                d=d+'+';
                textview.setText(d);

                break;
            case R.id.button20:
                String ee=textview.getText().toString();
                ee=ee+'-';
                textview.setText(ee);

                break;
            case R.id.button6:
                String f=textview.getText().toString();
                f=f+'√';
                textview.setText(f);

                break;
            case R.id.button7:
                String g=textview.getText().toString();
                g=g+'7';
                textview.setText(g);

                break;
            case R.id.button8:
                String h=textview.getText().toString();
                h=h+'8';
                textview.setText(h);

                break;
            case R.id.button9:
                String i=textview.getText().toString();
                i=i+'9';
                textview.setText(i);

                break;
            case R.id.button11:
                String j=textview.getText().toString();
                j=j+'!';
                textview.setText(j);

                break;
            case R.id.button12:
                String k=textview.getText().toString();
                k=k+'4';
                textview.setText(k);

                break;
            case R.id.button13:
                String l=textview.getText().toString();
                l=l+'5';
                textview.setText(l);

                break;
            case R.id.button14:
                String m=textview.getText().toString();
                m=m+'6';
                textview.setText(m);

                break;
            case R.id.button16:
                String n=textview.getText().toString();
                n=n+"3.1416";
                textview.setText(n);

                break;
            case R.id.button17:
                String o=textview.getText().toString();
                o=o+'1';
                textview.setText(o);

                break;
            case R.id.button18:
                String p=textview.getText().toString();
                p=p+'2';
                textview.setText(p);

                break;
            case R.id.button19:
                String q=textview.getText().toString();
                q=q+'3';
                textview.setText(q);

                break;
            case R.id.button21:
                String r=textview.getText().toString();
                r=r+'(';
                textview.setText(r);

                break;
            case R.id.button22:
                String s=textview.getText().toString();
                s=s+')';
                textview.setText(s);

                break;
            case R.id.button23:
                String t=textview.getText().toString();
                t=t+'0';
                textview.setText(t);

                break;
            case R.id.button24:
                String u=textview.getText().toString();
                u=u+'.';
                textview.setText(u);

                break;
            case R.id.button:
                String w=textview.getText().toString();
                w=w+'^';
                textview.setText(w);

                break;
            case R.id.button2:
                String xx=textview.getText().toString();
                xx=xx+"ln(";
                textview.setText(xx);

                break;
            case R.id.imageButton2:
                openactivity(v);

                break;




            case R.id.button25:

            try {
                String y = textview.getText().toString();

                textview.setText(calci(y));
                String  yy=calci(y);
            } catch (Exception e){
                textview.setText("INVALID INPUT");
            }

                break;

        }

    }
    public void openactivity(View v){
        Intent intent=new Intent(this,MainActivity2.class);
        startActivity(intent);
    }


    static String calci(String s)
    {   String h="";
        String w=s;
        while(h!=w){
            h=w;
            w=(brackets(w));
        }
        return (simpcal(h));
    }

    static String simpcal(String s){
        String h;
        String w=s;
        do{
            h=w;
            w=(fact(w));
        }while(h!=w);

        w=Log(w);

        do{
            h=w;
            w=(calc(w));
        }while(h!=w);

        w=squareroot(w);

        do{
            h=w;
            w=(divide(w));
        }while(h!=w);

        do{
            h=w;
            w=(multiply(w));
        }while(h!=w);

        w=(addsub(w));

        return(w);
    }

    static String fact(String s){
        int a=1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='!'){
                int n2=0;
                for(int j=i-1;j>=0;j--){
                    int n1=s.charAt(j);
                    if(n1<48||n1>57||j==0){
                        if(j==0) {n2=Integer.parseInt(s.substring(j, i));}
                        else { n2=Integer.parseInt(s.substring(j+1, i));}
                        while(n2>0){
                            a=a*n2;
                            n2=n2-1;
                        }

                        s=s.substring(0, j)+a+s.substring(i+1);
                        a=1;
                        break;
                    }
                }
            }
        }
        return s;
    }

    static String divide(String s){
        if(s.contains("/")){
            int i=s.indexOf("/");

            char c;
            String s1="";
            int f1=0, f2=0 ;
            for(int j=i+1; j<s.length();j++){
                f1=j;
                c=s.charAt(j);
                if((48<=((int)c)& ((int)c<58))|c=='.'){
                    s1=s1+c;
                }
                else {
                    break;}
            }
            double k=Double.valueOf(s1);

            int f3=0;
            s1="";
            for(int j=i-1; j>=0;j--){
                f2=j;
                c=s.charAt(j);
                if((48<=((int)c)& ((int)c<58))|c=='.'){
                    s1=c+s1 ;
                }
                else {f3=1;
                    break;}
            }

            double l=Double.valueOf(s1);

            String u="";
            double p= l/k;

            if((f2==0)&(f1!=s.length()-1)){switch(f3){
                case 0: u=(String.valueOf(p)+s.substring(f1,s.length()));
                    break;
                case 1:u=(s.charAt(0)+String.valueOf(p)+s.substring(f1,s.length()));
                    break;}
            }

            else if((f2!=0)&(f1==s.length()-1))
            {u=(s.substring(0,f2+1)+String.valueOf(p));
            }

            else if((f2==0)&(f1==s.length()-1)){switch(f3){

                case 0:u=(String.valueOf(p));
                    break;
                case 1:u=(s.charAt(0)+String.valueOf(p));
                    break;}
            }
            else
            {u=(s.substring(0,f2+1)+String.valueOf(p)+s.substring(f1,s.length()));}
            return u;
        }
        else{
            return s;
        }
    }
    static String multiply(String s){
        if(s.contains("x")){
            int i=s.indexOf("x");

            char c;
            String s1="";
            int f1=0, f2=0;
            for(int j=i+1; j<s.length();j++){
                f1=j;
                c=s.charAt(j);
                if((48<=((int)c)& ((int)c<58))|c=='.'){
                    s1=s1+c;
                }
                else {break;}
            }
            double k=Double.valueOf(s1);

            s1="";
            for(int j=i-1; j>=0;j--){
                f2=j;
                c=s.charAt(j);
                if((48<=((int)c)& ((int)c<58))|c=='.'){
                    s1=c+s1 ;
                }
                else {break;}
            }
            double l=Double.valueOf(s1);
            double p= l*k;
            if((f2==0)&(f1!=s.length()-1)){return(String.valueOf(p)+s.substring(f1,s.length()));}
            else if((f2!=0)&(f1==s.length()-1))
            {return(s.substring(0,f2+1)+String.valueOf(p));}
            else if((f2==0)&(f1==s.length()-1)){
                return(String.valueOf(p));
            }
            else
            {return(s.substring(0,f2+1)+String.valueOf(p)+s.substring(f1,s.length()));}
        }
        else{
            return s;
        }
    }
    static String addsub(String s){
        double res=0;
        int index=0;
        if(s.length()==1){return s;}
        else {
            for(int i=1;i<s.length();i++){
                if((s.charAt(i)<47|s.charAt(i)>58|i==s.length()-1)&s.charAt(i)!='.'){
                    if(i==s.length()-1)  res+=Double.parseDouble(s.substring(index,i+1));
                    else  res+=Double.parseDouble(s.substring(index,i));
                    index=i;
                }
            }
            s=res+"";
            return s;}
    }
    static String calc(String s){
        String d1="";
        String d2="";
        double ev;
        for(int i=0;i<s.length();i++){
            d1="";
            d2="";
            ev=0;
            if(s.charAt(i)=='^'){
                for(int j=i+1;j<s.length();j++){
                    if((s.charAt(j)>47&s.charAt(j)<58)|(s.charAt(j)=='.')){
                        d1=d1+s.substring(j,j+1);
                    }
                    else{
                        break;
                    }
                }
                for(int k=i-1;k>=0;k--){
                    if((s.charAt(k)>46&s.charAt(k)<59&k!=0)|(s.charAt(k)=='.')) {
                        continue;
                    }
                    else{
                        if(k==0)  d2=s.substring(k,i);
                        else d2=s.substring(k+1,i);
                        break;
                    }
                }
                ev=Math.pow(Double.parseDouble(d2),Double.parseDouble(d1));
                s=s.substring(0,i-d2.length())+ev+s.substring(i+d1.length()+1);
            }
        }
        //s=s.replaceAll("E","x10^");
        return s;
    }
    static String brackets(String s){
        String ans="";
        if(s.contains("(")){
            int a=s.indexOf('(');
            String h="";
            int i;
            int c=s.length();
            int b=a;
            for(i=a+1; i<s.length(); i++){
                switch(s.charAt(i)){
                    case '(':{h="";
                        b=i;
                        break;}

                    case ')':{c=i+1;
                        break;

                    }
                    default: h=h+s.charAt(i);
                }
                if(c==i+1){break;}
            }

            if((h.startsWith("-"))& b!=1){
                switch(s.charAt(b-1)){
                    case '+':{ans=(s.substring(0,b-1)+pm(s.charAt(b-1),'-')+simpcal(h).substring(1)+s.substring(c) );
                        break;}
                    case '-':{ans=(s.substring(0,b-1)+pm(s.charAt(b-1),'+')+simpcal(h).substring(1)+s.substring(c) );
                        break;}
                    case '*':String s1="";
                    char g;
                        int f1=0;
                        for(int j=b-2; j>=0;j--){
                            f1=j;
                            g=s.charAt(j);
                            if((48<=((int)g)& ((int)g<58))|g=='.'){
                                s1=g+s1 ;
                            }
                            else {break;}
                        }
                        double l=Double.valueOf(s1);
                        double p=l*Double.valueOf(simpcal(h));
                        if(f1==0){return(String.valueOf(p)+s.substring(c));}
                        else {ans=(s.substring(0,f1)+String.valueOf(p)+s.substring(c));}
                        break;

                    case '/':s1="";
                        f1=0;
                        for(int j=b-2; j>=0;j--){
                            f1=j;
                            g=s.charAt(j);
                            if((48<=((int)g)& ((int)g<58))|g=='.'){
                                s1=g+s1 ;
                            }
                            else {break;}
                        }
                        l=Double.valueOf(s1);
                        p=l/Double.valueOf(simpcal(h));

                        if(f1==0){return(String.valueOf(p)+s.substring(c));}
                        else {
                            ans=(s.substring(0,f1)+String.valueOf(p)+s.substring(c));}
                        break;
                        default: ans= "";}}
            else{
                ans=s.substring(0,b)+simpcal(h)+s.substring(c);
            }
            return ans;
        }
        else {return s;}
    }

    static String pm(char a, char b){
        String s="";
        if((a=='+')&(b=='+')){s="+";}
        if((a=='-')&(b=='+')){s="-";}
        if((a=='+')&(b=='-')){s="-";}
        if((a=='-')&(b=='-')){s="+";}
        return s;
    }
    static String squareroot(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='√'){
                for(int j=i+1;j<s.length();j++){
                    if((s.charAt(j)<46|s.charAt(j)>58|j==s.length()-1)&s.charAt(j)!='.'){
                        if(j==s.length()-1) s=s.substring(0,i)+Math.sqrt(Double.parseDouble(s.substring(i+1,j+1)))+s.substring(j+1);
                        else  s=s.substring(0,i)+Math.sqrt(Double.parseDouble(s.substring(i+1,j)))+s.substring(j);
                        break;
                    }
                }
            }
        }
        return s;}

    static String Log(String s){
        double lg=0;
        String s2;
        if(s.contains("ln")){
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='n'){
                    for(int j=i+1;j<s.length();j++){
                        if((s.charAt(j)<47|s.charAt(j)>58|j==s.length()-1)&(s.charAt(j)!='.')){
                            s2=s.substring(i+1,j+1);
                            lg=Math.log(Double.parseDouble(s2));
                            s=s.substring(0,i-1)+lg+s.substring(j);
                            break;
                        }
                    }
                }
            }
        }
        return s;
    }
}
