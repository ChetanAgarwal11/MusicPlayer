package com.example.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btstart,btstop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btstart = findViewById(R.id.btstart);
        btstop = findViewById(R.id.btstop);
        btstart.setOnClickListener(this);
        btstop.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btstart :
                startService(new Intent(this,MyPlayer.class));
                break;
            case R.id.btstop :
                stopService(new Intent(this,MyPlayer.class));
                break;

        }
    }
}
