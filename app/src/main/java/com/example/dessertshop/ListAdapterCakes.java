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

// extends (i).ArrayAdapter, (ii).AppCompatActivity implements AdapterView.OnItemClickListener, (iii).BaseAdapter

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