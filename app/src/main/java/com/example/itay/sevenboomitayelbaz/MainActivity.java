package com.example.itay.sevenboomitayelbaz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
int x=1,y;
Button btn;
boolean boom=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    btn=(Button) findViewById(R.id.btn);
    }

    public void btn(View view) {
        y=x;
        boom=false;
        while(y!=0) {
        if(y%10==7){boom=true;}
        y/=10;
        }
        if (x%7==0){boom=true;}
        if (boom==true){btn.setText("boom");}
            else{btn.setText(""+x);}
        x++;
        }
    }

