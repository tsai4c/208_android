package com.example.a208_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class activity extends AppCompatActivity {

    ImageButton imgButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_);

        imgButton = (ImageButton) findViewById(R.id.aic);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openaic();
            }
        });

        imgButton = (ImageButton) findViewById(R.id.nycu);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennycu();
            }
        });

        imgButton = (ImageButton) findViewById(R.id.month);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmonth();
            }
        });

        imgButton = (ImageButton) findViewById(R.id.ait);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openait();
            }
        });

        imgButton = (ImageButton) findViewById(R.id.aws);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openaws();
            }
        });

        imgButton = (ImageButton) findViewById(R.id.stem);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openstem();
            }
        });

        imgButton = (ImageButton) findViewById(R.id.bott);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbott();
            }
        });

        imgButton = (ImageButton) findViewById(R.id.practice);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openpractice();
            }
        });

        imgButton = (ImageButton) findViewById(R.id.gift);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengift();
            }
        });

        imgButton = (ImageButton) findViewById(R.id.english);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openenglish();
            }
        });

        imgButton = (ImageButton) findViewById(R.id.music);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmusic();
            }
        });

        imgButton = (ImageButton) findViewById(R.id.dance);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendance();
            }
        });

        imgButton = (ImageButton) findViewById(R.id.volley);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openvolley();
            }
        });

        imgButton = (ImageButton) findViewById(R.id.nineth);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennineth();
            }
        });

        imgButton = (ImageButton) findViewById(R.id.book);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbook();
            }
        });

        imgButton = (ImageButton) findViewById(R.id.cybersce);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencybersce();
            }
        });
}

    private void openaic() {
        Intent intent = new Intent(this, aic.class);
        startActivity(intent);
    }
    private void openait() {
        Intent intent = new Intent(this, ait.class);
        startActivity(intent);
    }
    private void openaws() {
        Intent intent = new Intent(this, aws.class);
        startActivity(intent);
    }
    private void opennycu() {
        Intent intent = new Intent(this, nycu.class);
        startActivity(intent);
    }
    private void openbott() {
        Intent intent = new Intent(this, bott.class);
        startActivity(intent);
    }
    private void openbook() {
        Intent intent = new Intent(this, book.class);
        startActivity(intent);
    }
    private void openmonth() {
        Intent intent = new Intent(this, month.class);
        startActivity(intent);
    }
    private void openmusic() {
        Intent intent = new Intent(this, music.class);
        startActivity(intent);
    }
    private void openvolley() {
        Intent intent = new Intent(this, volley.class);
        startActivity(intent);
    }
    private void openstem() {
        Intent intent = new Intent(this, stem.class);
        startActivity(intent);
    }
    private void openpractice() {
        Intent intent = new Intent(this, practice.class);
        startActivity(intent);
    }
    private void opengift() {
        Intent intent = new Intent(this, gift.class);
        startActivity(intent);
    }
    private void opennineth() {
        Intent intent = new Intent(this, nineth.class);
        startActivity(intent);
    }
    private void opendance() {
        Intent intent = new Intent(this, dance.class);
        startActivity(intent);
    }
    private void openenglish() {
        Intent intent = new Intent(this, english.class);
        startActivity(intent);
    }
    private void opencybersce() {
        Intent intent = new Intent(this, cybersce.class);
        startActivity(intent);
    }
    }