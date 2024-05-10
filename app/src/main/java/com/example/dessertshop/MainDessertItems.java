package com.example.dessertshop;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainDessertItems extends AppCompatActivity {

    String titleDessertList[]= {"Pudding", "Donuts", "Ice Cream", "Chocolate Bar", "Baklava", "Macaroon", "Chocolate Brownie"};
    int dessertImages[] = {R.drawable.pudding, R.drawable.donuts, R.drawable.ice_cream, R.drawable.chocolate_bar, R.drawable.baklava, R.drawable.macaroon, R.drawable.chocolate_brownie};
    String dessertId[] = {"01", "02", "03","04", "05", "06", "07"};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dessert_items);

//        String[] dessertList = getResources().getStringArray(R.array.dessertList);

        listView = (ListView) findViewById(R.id.listviewDessert);

        ListAdapterDessert listAdapterDessert = new ListAdapterDessert(getApplicationContext(), titleDessertList, dessertImages,dessertId);
        listView.setAdapter(listAdapterDessert);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("ListView", "Item is clicked @ Position :: " + position);
            }
        });
    }
}