package com.example.a208_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button url;
    private Button button;
    ImageButton imgButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageSlider imageSlider = findViewById(R.id.imageSlider);
        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.slider1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.slider2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.slider3, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.slider4, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.slider5, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.slider6, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.slider7, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.slider8, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.slider9, ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        button = (Button) findViewById(R.id.introduction);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openintroduction();
            }
        });

        button = (Button) findViewById(R.id.awards);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openawards();
            }
        });

        button = (Button) findViewById(R.id.activity);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity();
            }
        });

        url = findViewById(R.id.url);
        url.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://nhcs11th.000webhostapp.com/major.html");
            }
        });

        imgButton = (ImageButton) findViewById(R.id.nhsh);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://www.nhsh.tp.edu.tw");
            }
        });

    }



    private void openawards() {
        Intent intent = new Intent(this, awards.class);
        startActivity(intent);
    }

    private void openintroduction() {
        Intent intent = new Intent(this, introduction.class);
        startActivity(intent);
    }

    private void openactivity() {
        Intent intent = new Intent(this, activity.class);
        startActivity(intent);
    }

    private void goLink(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }


}