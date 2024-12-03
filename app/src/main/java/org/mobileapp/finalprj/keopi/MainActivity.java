package org.mobileapp.finalprj.keopi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Thread splashThread = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(3000);
                    Intent splashIntent = new Intent(MainActivity.this, HomePage.class);
                    startActivity(splashIntent);
                    MainActivity.this.finish();
                }catch (Exception myerror){
                    Toast.makeText(MainActivity.this, "Application Error"+ myerror, Toast.LENGTH_SHORT).show();
                }
            }
        };
        splashThread.start();
    }
}