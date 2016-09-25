package com.example.sergio.skinuvhealth;

/**
 * Created by sergio on 9/11/16.
 */

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

/**
 * Created by vamsikrishna on 12-Feb-15.
 */
public class SplashActivity extends Activity {
    boolean homeScore = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                    // Get from the SharedPreferences
                    SharedPreferences settings = getSharedPreferences("DatosAppSkin", 0);
                    homeScore = settings.getBoolean("isNew", false);








                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    if(homeScore) {
                        Intent intent = new Intent(SplashActivity.this, MainActivity2.class);
                        startActivity(intent);
                    }
                    else{
                        SharedPreferences settings = getSharedPreferences("DatosAppSkin", 0);
                        SharedPreferences.Editor editor = settings.edit();
                        editor.putBoolean("isNew", true);

                        // Apply the edits!
                        editor.apply();
                        editor.commit();

                        Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                        startActivity(intent);
                    }

                }
            }
        };
        timerThread.start();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        finish();
    }

}