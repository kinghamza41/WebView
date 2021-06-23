package com.hamza.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnGoogle, btnFacebook;
    String[] urls=new String[2];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGoogle = (Button) findViewById(R.id.btn1);
        btnFacebook = (Button) findViewById(R.id.btn2);
        urls[0]="https //www.google.com";
        urls[1]="https //www.facebook.com";
        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getApplicationContext(),webActivity.class);
                intent.putExtra("links", urls[0]);
                startActivity(intent);
            }
        });

        btnFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getApplicationContext(),webActivity.class);
                intent.putExtra("links", urls[1]);
                startActivity(intent);
            }
        });
    }
}
