package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);

        final String message = "I love myself";

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();

                intent.setAction(Intent.ACTION_SEND);

                intent.putExtra(Intent.EXTRA_TEXT,message);

                intent.setType("text/plain");
                if(intent.resolveActivity((getPackageManager()) )!= null) {
                    startActivity(intent);
                }

            }
        });
    }
}
