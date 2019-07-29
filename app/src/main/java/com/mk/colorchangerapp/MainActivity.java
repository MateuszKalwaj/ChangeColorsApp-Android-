package com.mk.colorchangerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private View windowView;
    private Button tryMeButton;
    private int[] colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colors = new int[]{Color.BLUE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.GRAY, Color.DKGRAY,
        Color.LTGRAY};

        tryMeButton = findViewById(R.id.tryMeButton);
        windowView = findViewById(R.id.windowViewId);


        tryMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int colorArrayLength = colors.length;
                Random random = new Random();
                int randomNum = random.nextInt(colorArrayLength);
                windowView.setBackgroundColor(colors[randomNum]);
                Log.d("Random : ", String.valueOf(randomNum));
            }
        });
    }
}
