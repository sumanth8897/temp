package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.instagram);
        button1=findViewById(R.id.tiktok);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


               String url="https://www.instagram.com/samantharuthprabhuoffl";
                String res=url.replace("https://www.instagram.com/","https://www.instagram.com/_u/");

                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(res));
                intent.setPackage("com.instagram.android");
                try {
                    startActivity(intent);
                }catch (ActivityNotFoundException e){
                    startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse(url)));
                }


            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://vm.tiktok.com/TFGxEQ/";
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}
