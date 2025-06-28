package com.example.acp_changeimages;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;
import android.content.res.Resources;

public class MainActivity extends AppCompatActivity {

    ImageView imgFact;
    Button btnFact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgFact = (ImageView) findViewById(R.id.imageView2);
        btnFact = (Button) findViewById(R.id.button1);

        Drawable FactImages[] = new Drawable[10];
        String FactText[] = new String[10];

        Resources res = getResources();
        FactImages[0] = res.getDrawable(R.drawable.img1);
        FactImages[1] = res.getDrawable(R.drawable._mg2);
        FactImages[2] = res.getDrawable(R.drawable.img3_);
        FactImages[3] = res.getDrawable(R.drawable.img4);
        FactImages[4] = res.getDrawable(R.drawable.img5);

        btnFact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomNumber = new Random();
                int numberGenerated = randomNumber.nextInt(5 - 0) + 0;
                imgFact.setImageDrawable(FactImages[numberGenerated]);
            }
        });


    }
}