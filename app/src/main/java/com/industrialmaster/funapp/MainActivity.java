package com.industrialmaster.funapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openActivity(View view){
        Intent intent=new Intent(getApplicationContext(),ActivityActivity.class);
        //getApplicationContext()=this,MainActivity.this
        //Have diff usages.here i'm using getApplicationContext()
        startActivity(intent);
    }

    public void openService(View view){
        Intent intent=new Intent(getApplicationContext(),ServiceActivity.class);
        //getApplicationContext()=this,MainActivity.this
        //Have diff usages.here i'm using getApplicationContext()
        startActivity(intent);
    }

    public void openContentProvider(View view){
        Intent intent=new Intent(getApplicationContext(),ContentProviderActivity.class);
        //getApplicationContext()=this,MainActivity.this
        //Have diff usages.here i'm using getApplicationContext()
        startActivity(intent);
    }

    public void openBroadcastProvider(View view){
        Intent intent=new Intent(getApplicationContext(),BroadcastReceiverActivity.class);
        //getApplicationContext()=this,MainActivity.this
        //Have diff usages.here i'm using getApplicationContext()
        startActivity(intent);
    }

}
