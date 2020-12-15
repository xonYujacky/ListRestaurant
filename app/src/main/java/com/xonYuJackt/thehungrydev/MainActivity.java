package com.xonYuJackt.thehungrydev;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CardView starterCard;
    CardView mainCard;
    CardView dessertCard;
    TextView text_email_address;

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

        mainCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Explisit intent = hanya berpindah di dalam aplikasi itu sendiri
                Intent MainCoursesIntent = new Intent(MainActivity.this,MainCoursesActivity.class);
                startActivity(MainCoursesIntent);
            }
        });
        text_email_address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Implisit intent kayak direct ke aplikasi lain,camera,telepon ,dll
                Intent lauchEmailAppIntent = new Intent(Intent.ACTION_SENDTO);
                lauchEmailAppIntent.setData(Uri.parse("mailto:thehungryrestaurant@xonyujacky.com" +text_email_address));
                lauchEmailAppIntent.putExtra(Intent.EXTRA_EMAIL, "THe Hungry Restaurant");
                lauchEmailAppIntent.putExtra(Intent.EXTRA_SUBJECT, "Hallow!");
                startActivity(lauchEmailAppIntent);
            }
        });

        dessertCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dessertIntent = new Intent(MainActivity.this,DessertActivity.class);
                startActivity(dessertIntent);
            }
        });


    }

    private void findView(){
        starterCard = findViewById(R.id.card_view_starter);
        mainCard = findViewById(R.id.card_view_main_course);
        dessertCard = findViewById(R.id.card_view_dessert);
        text_email_address = findViewById(R.id.text_view_restaurant_email);
    }
}
