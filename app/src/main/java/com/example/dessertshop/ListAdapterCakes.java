package com.example.dessertshop;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

//public class ListAdapterCakes extends ArrayAdapter<ListDataCakes> {
//
//    public ListAdapterCakes(@NonNull Context context, ArrayList<ListDataCakes> dataCakesArrayList) {
//        super(context, R.layout.list_item_cakes, dataCakesArrayList);
//    }
//
//    @NonNull
//    @Override
//    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {
//        ListDataCakes listDataCakes = getItem(position);
//
//        if (view == null) {
//            view = LayoutInflater.from(getContext()).inflate(R.layout.list_item_cakes, parent, false);
//        }
//
//        ImageView listImageCakes = view.findViewById(R.id.listImageCakes);
//        TextView listTitleCakes = view.findViewById(R.id.listTitleCakes);
////        TextView listDetails = view.findViewById(R.id.listCakeDetails);
//        TextView listCakesId = view.findViewById(R.id.listCakesId);
//
//        listImageCakes.setImageResource(listDataCakes.image);
//        listTitleCakes.setText(listDataCakes.title);
////        listDetails.setText(listDataCakes.details);
//        listCakesId.setText(listDataCakes.id);
//
//        return view;
//    }
//}

//*****************************************************************************************

//public class ListAdapterCakes extends AppCompatActivity implements AdapterView.OnItemClickListener {
//    ListView cakeList;
//
//    @SuppressLint("MissingSuperCall")
//    @Override
//    protected void onCreate(Bundle savedInstanceState){
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main_cake_items);
//
//        cakeList=(ListView)findViewById(R.id.listviewCakes);
//        cakeList.setOnItemClickListener(this);
//    }
//
//    @Override
//    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//        String name=(String)parent.getItemAtPosition(position);
//
//        if(name.equals("Cake")){
//            Toast.makeText( getBaseContext(), "Cake Selected",Toast.LENGTH_SHORT).show();
//        } else if (name.equals("Pastry")) {
//            Toast.makeText( getBaseContext(), "Pastry Selected",Toast.LENGTH_SHORT).show();
//        } else if (name.equals("Dessert")) {
//            Toast.makeText( getBaseContext(), "Dessert Selected",Toast.LENGTH_SHORT).show();
//        }
//    }
//}

//*********************************************************************************

public class ListAdapterCakes extends BaseAdapter {
    Context context;
    String listCakesTitle[];
    int listCakesImages[];

    String listCakeId[];
    LayoutInflater inflater;

    public ListAdapterCakes(Context context, String titleCakeList[], int cakeImages[], String cakeId[]){
        this.context = context;
        this.listCakesTitle = titleCakeList;
        this.listCakesImages = cakeImages;
        this.listCakeId = cakeId;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return listCakesTitle.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = inflater.inflate(R.layout.list_item_cakes, null);

        ImageView listImageCakes = (ImageView) convertView.findViewById(R.id.listImageCakes);
        TextView listTitleCakes = (TextView) convertView.findViewById(R.id.listTitleCakes);
        TextView listCakesId = (TextView) convertView.findViewById(R.id.listCakesId);

        listTitleCakes.setText(listCakesTitle[position]);
        listCakesId.setText(listCakeId[position]);
        listImageCakes.setImageResource(listCakesImages[position]);

        return convertView;
    }
}