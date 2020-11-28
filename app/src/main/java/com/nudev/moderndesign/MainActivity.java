package com.nudev.moderndesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    boolean night;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        night = getIntent().getBooleanExtra("night_mode", false);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mChangeTheme = (Button) findViewById(R.id.toggleThemes);
        mChangeTheme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chgTheme();
            }
        });
    }

    public void chgTheme() {
        night = !night;
        Intent intent = new Intent(MainActivity.this, MainActivity.class);
        intent.putExtra("night_mode", night);
        startActivity(intent);
    }
}
