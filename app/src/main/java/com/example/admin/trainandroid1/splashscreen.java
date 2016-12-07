package com.example.admin.trainandroid1;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;




public class splashscreen extends AppCompatActivity {

    Handler handler;
    Runnable runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        handler= new Handler();
        runnable= new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splashscreen.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        };

    }
    public void onResume(){
        super.onResume();
        handler.postDelayed(runnable,4000);
    }
    public void onStop(){
        super.onStop();
        handler.removeCallbacks(runnable);
    }
}
