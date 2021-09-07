package com.example.temp1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
              if(FirebaseAuth.getInstance().getCurrentUser()==null){
                  startActivity(new Intent(SplashActivity.this,FaceBookLoginActivity.class));
                  finish();
              }
              else{
                  startActivity(new Intent(SplashActivity.this,DashboardActivity.class));
              }
            }
        }, 3000);
    }
}
