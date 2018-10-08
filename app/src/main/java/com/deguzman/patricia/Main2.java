package com.deguzman.patricia;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2 extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen2);
        setTitle("Activity 2");
    }

    public void process(View v){
        Intent i = null, chooser = null;
        if(v.getId() == R.id.btn_screen1){
            i = new Intent(this,MainActivity.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.btn_map){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.523157, 120.993060"));
            chooser = Intent.createChooser(i,"Select Map App: ");
            startActivity(chooser);
        }
    }
}
