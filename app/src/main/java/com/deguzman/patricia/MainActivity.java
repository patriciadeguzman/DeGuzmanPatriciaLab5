package com.deguzman.patricia;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Activity 1");
        Log.d("4IT-H", "onCreate has started.");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("4IT-H", "onStart has started.");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("4IT-H", "onResume has started.");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("4IT-H", "onStop has started.");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("4IT-H", "onPause has started.");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("4IT-H", "onRestart has started.");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("4IT-H", "onDestroy has started.");
    }

    public void process(View v){
        Intent i = null, chooser = null;
        if(v.getId() == R.id.btn_screen2){
            i = new Intent(this,Main2.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.btn_map){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.524033, 120.992813"));
            chooser = Intent.createChooser(i,"Select Map App: ");
            startActivity(chooser);
        }
    }
}
