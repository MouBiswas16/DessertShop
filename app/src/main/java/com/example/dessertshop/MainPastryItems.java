package com.example.dessertshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.dessertshop.ui.ListAdapterPastry;

public class MainPastryItems extends AppCompatActivity {
    String titlePastryList[] = {"Croissant", "Cinnamon Roll", "Bread", "Biscuits"};
    int pastryImages[] = {R.drawable.croissant, R.drawable.cinnamon_roll, R.drawable.bread, R.drawable.biscuits};
    String pastryId[] = {"01", "02", "03","04"};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_pastry_items);

        listView = (ListView) findViewById(R.id.listviewPastry);

        ListAdapterPastry listAdapterPastry = new ListAdapterPastry(getApplicationContext(), titlePastryList, pastryImages, pastryId);
        listView.setAdapter(listAdapterPastry);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("ListView", "Item is clicked @ Position :: " + position);
            }
        });
    }
}