package com.voice.auth.testjni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JNILoader jinLoader = new JNILoader();
        TextView textView = findViewById(R.id.text_s_tv);
        textView.setText(jinLoader.getNativeString());
    }
}