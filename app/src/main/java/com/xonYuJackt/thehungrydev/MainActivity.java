package com.xonYuJackt.thehungrydev;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView starterCard;
    CardView mainCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
        starterCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Starterintent = new Intent(MainActivity.this,StarterActivity.class);
                startActivity(Starterintent);
            }
        });


    }

    private void findView(){
        starterCard = findViewById(R.id.card_view_starter);
        mainCard = findViewById(R.id.card_view_main_course);
    }
}
