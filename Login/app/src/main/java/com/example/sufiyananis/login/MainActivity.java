package com.example.sufiyananis.login;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    EditText et2;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);
        btn = (Button) findViewById(R.id.btn);
    }

    public void OnClick(View v){
        if(et1.getText().toString().equals("abcd") && et2.getText().toString().equals("1234")){
            Intent intent = new Intent(MainActivity.this,Main2Activity.class) ;
            startActivity(intent);
        }
        else{
            AlertDialog.Builder message = new AlertDialog.Builder(this);
            message.setMessage("       Invalid Username and Password").create();
            message.show();
        }
    }
}
