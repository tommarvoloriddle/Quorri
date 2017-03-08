package com.example.saki.quorri;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button rulebutton = (Button)findViewById(R.id.rules_button);
        if (rulebutton != null) {
            rulebutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(), ShowRules.class);
                    startActivity(intent);
                }
            });
        }
        Button startButton = (Button)findViewById(R.id.start_button);
        if (startButton != null) {
            startButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(),Game.class);
                    startActivity(intent);
                }
            });
        }
    }


}

