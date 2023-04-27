package com.example.a208_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class awards extends AppCompatActivity {

    ImageButton imgButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_awards);

        imgButton = (ImageButton) findViewById(R.id.gics);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengics();
            }
        });

        imgButton = (ImageButton) findViewById(R.id.open);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openopen();
            }
        });

        imgButton = (ImageButton) findViewById(R.id.creative);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencreative();
            }
        });

        imgButton = (ImageButton) findViewById(R.id.internet);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openinternet();
            }
        });

        imgButton = (ImageButton) findViewById(R.id.python);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openpython();
            }
        });

        imgButton = (ImageButton) findViewById(R.id.ability);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openability();
            }
        });

        imgButton = (ImageButton) findViewById(R.id.dragon);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendragon();
            }
        });

        imgButton = (ImageButton) findViewById(R.id.tcreative);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentcreative();
            }
        });
}

    private void opentcreative() {
        Intent intent = new Intent(this, tcreative.class);
        startActivity(intent);
    }

    private void opendragon() {
        Intent intent = new Intent(this, dragon.class);
        startActivity(intent);
    }

    private void openability() {
        Intent intent = new Intent(this, ability.class);
        startActivity(intent);
    }

    private void openpython() {
        Intent intent = new Intent(this, python.class);
        startActivity(intent);
    }

    private void openinternet() {
        Intent intent = new Intent(this, internet.class);
        startActivity(intent);
    }

    private void opencreative() {
        Intent intent = new Intent(this, creative.class);
        startActivity(intent);
    }

    private void openopen() {
        Intent intent = new Intent(this, open.class);
        startActivity(intent);
    }

    private void opengics() {
        Intent intent = new Intent(this, gics.class);
        startActivity(intent);
    }
    }