package com.example.dessertshop;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.dessertshop.databinding.ActivityMainBinding;
import com.example.dessertshop.databinding.ActivityMainCakeItemsBinding;

import java.util.ArrayList;

public class MainCakeItems extends AppCompatActivity{
    String titleCakeList[] = {"Vanilla Cake", "Chocolate Cake", "Strawberry Cake"};
    int cakeImages[] = {R.drawable.vanilla_cake, R.drawable.chocolate_cake, R.drawable.strawberry_cake};
    String cakeId[] = {"01", "02", "03"};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_cake_items);

        listView = (ListView) findViewById(R.id.listviewCakes);

        ListAdapterCakes listAdapterCakes = new ListAdapterCakes(getApplicationContext(), titleCakeList, cakeImages, cakeId);
        listView.setAdapter(listAdapterCakes);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("ListView", "Item is clicked @ Position :: " + position);
            }
        });
    }
}