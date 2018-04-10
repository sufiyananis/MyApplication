package com.example.sufiyananis.myapplication;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    EditText e1;
    Button b1;
    TextView t1;
    TextView t2;
    TextView t4;
    TextView t5;
   int sc=0 ,ck=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    public void onButtonClick(View v)
    {
        Random rn = new Random();
         e1 = (EditText)findViewById(R.id.editText);
         t1 = (TextView)findViewById(R.id.textView);
         t2 = (TextView)findViewById(R.id.textView2);
        t4 = (TextView)findViewById(R.id.textView4);
        t5 = (TextView)findViewById(R.id.textView5);
         b1 = (Button)findViewById(R.id.button);
       int a = rn.nextInt(10);
       int b = rn.nextInt(10);
       int c = a+b;
       int value = Integer.parseInt(e1.getText().toString());
       if(value==c){
           sc= sc+10;
           ck++;
       }
       else{
           sc= sc-10;
       }
       if(sc<-90){
           e1.setEnabled(false);
           b1.setEnabled(false);
           AlertDialog.Builder message = new AlertDialog.Builder(this);
           message.setMessage("       Game Over ! ").create();
           message.show();

       }
        t1.setText(a+"");
        t2.setText(b+"");
        e1.setText("");
       t4.setText("Score: "+sc);
       t5.setText("Correct: "+ck);
    }
    public void Refresh(View v1){
        if (sc<-90) {
            t1.setText("");
            t2.setText("");
            sc = 0;
            e1.setEnabled(true);
            b1.setEnabled(true);
            t4.setText("Score: 0");
            t5.setText("Correct: 0");
        }
    }

}
