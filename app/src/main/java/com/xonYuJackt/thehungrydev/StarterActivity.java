package com.xonYuJackt.thehungrydev;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StarterActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starter);

  /*      Dish dishOne = new Dish();
        dishOne.title = "Mushroom and tofu maki";
        dishOne.desciption = "Toasted seaweed wrapped around sushirice ,filled with chesnut mushroom and smoke tofu";
        dishOne.price = 999;*/
        //OOP
        //Dish dish1 = new Dish("Melon and lemon soup", "Fresh melon and lemon combined into creamy soup", 1199);
        //Using Array
        ListView starterList = findViewById(R.id.list_view_starters);
        Dish[] dishes = {
                new Dish("Melon and lemon soup", "Fresh melon and lemon combined into creamy soup", 1199),
                new Dish("Coconut and chocolate mousse", "A creamy mousse made with fresh coconut and milk chocolate", 899),
                new Dish("Spinach and cabbage wontons", "Thin wonton cases stuffed with fresh spinach and chinese cabbage", 799),
                new Dish("Broccoli and cucumber soup", "Fresh broccoli and cucumber combined into creamy soup", 899),
                new Dish("Chilli and aubergine dip", "A dip made from scotch bonnet chilli and fresh aubergine", 999),
                new Dish("Chickpea and chilli gyoza", "Thin pastry cases stuffed with fresh chickpea and green chilli", 699),
                new Dish("Sprout and pineapple soup", "Fresh sprout and pineapple combined into creamy soup", 899),
                new Dish("Egusi and borscht soup", "Egusi and borscht combined into creamy soup", 1299)
        };

        //Array manual tanpa OOP
       /* ListView starterList = findViewById(R.id.list_view_starters);
        String[] dishes = {
                "Mushroom and tofu maki",
                "Egg and avocado uramaki",
                "Melon and lemon soup",
                "Coconut and chocolate mousse",
                "Spinach and cabbage wontons",
                "Broccoli and cucumber soup",
                "Chilli and aubergine dip",
                "Chickpea and chilli gyoza",
                "Sprout and pineapple soup",
                "Egusi and borscht soup",
                "Aubergine and egg sushi",
                "Artichoke and mustard soup",
                "Peppercorn and tamarind soup",
                "Parsley and celeriac parcels",
                "Pasta and broccoli soup",
                "Potato and courgette soup",
                "Chickpea and cabbage parcels",
                "Coriander and peppercorn gyoza",
                "Pear and chestnut soup",
                "Pesto and garam masala parcels"
        };*/

        //ArrayAdapter<type> (name Adapter) new ArrayAdapter<>(Context : ke halaman apa,design layout,arraylist nya);
        //ArrayAdapter<String> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);
        //Array using class OOP
        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);
        starterList.setAdapter(dishesAdapter);

    }
}
