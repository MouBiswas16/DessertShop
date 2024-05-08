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

//public class MainCakeItems extends AppCompatActivity {
//    ActivityMainCakeItemsBinding binding;
//    ListAdapterCakes listAdapterCakes;
//    ArrayList<ListDataCakes> dataCakesArrayList = new ArrayList<>();
//    ListDataCakes listDataCakes;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        binding = ActivityMainCakeItemsBinding.inflate(getLayoutInflater());
////        setContentView(R.layout.activity_main_cake_items);
//        setContentView(binding.getRoot());
//
//        int[] imageCakeList = {R.drawable.vanilla_cake, R.drawable.chocolate_cake, R.drawable.strawberry_cake};
//        int[] idCakeList = {R.string.vanillaCakeId, R.string.chocolateCakeId, R.string.strawberryCakeId};
//        int[] titleCakeList = {R.string.vanillaCakeTitle, R.string.chocolateCakeTitle, R.string.strawberryCakeTitle};
//        int[] detailsCakeList = {R.string.vanillaCakeDetails, R.string.chocolateCakeDetails, R.string.strawberryCakeDetails};
//        String[] titleList = {"Vanilla Cake", "Chocolate Cake", "Strawberry Cake"};
//        String[] idList = {"01", "02", "03"};
//
//        for (int i = 0; i < imageCakeList.length; i++) {
//            listDataCakes = new ListDataCakes(titleList[i],idList[i], imageCakeList[i],idCakeList[i], titleCakeList[i], detailsCakeList[i]);
//            dataCakesArrayList.add(listDataCakes);
//        }
////        listAdapterCakes = new ListAdapterCakes(MainCakeItems.this,dataCakesArrayList);
////        binding.listviewCakes.setAdapter(listAdapterCakes);
//        binding.listviewCakes.setClickable(true);
//
//        binding.listviewCakes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
//                Intent intent = new Intent(MainCakeItems.this, DetailsCakes.class);
//                intent.putExtra("image", imageCakeList[i]);
//                intent.putExtra("id", idCakeList[i]);
//                intent.putExtra("title", titleCakeList[i]);
//                intent.putExtra("details", detailsCakeList[i]);
//                intent.putExtra("title", titleList[i]);
//                intent.putExtra("id", idList[i]);
//                startActivity(intent);
//            }
//        });
//    }
//}

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