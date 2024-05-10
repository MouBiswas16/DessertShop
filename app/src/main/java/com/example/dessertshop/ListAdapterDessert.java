package com.example.dessertshop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListAdapterDessert extends BaseAdapter {

    Context context;
    String listDessertTitle[];
    int listDessertImages[];
    String listDessertsId[];
    LayoutInflater inflater;

    public ListAdapterDessert(Context context, String titleDessertList[], int dessertImages[], String dessertId[]){
        this.context = context;
        this.listDessertTitle = titleDessertList;
        this.listDessertImages = dessertImages;
        this.listDessertsId = dessertId;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return listDessertTitle.length;
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
        convertView = inflater.inflate(R.layout.list_item_dessert, null);

        ImageView listImagesDessert = (ImageView) convertView.findViewById(R.id.listImageDessert);
        TextView listTitleDessert = (TextView) convertView.findViewById(R.id.listTitleDessert);
        TextView listDessertId = (TextView) convertView.findViewById(R.id.listDessertId);

        listTitleDessert.setText(listDessertTitle[position]);
        listDessertId.setText(listDessertsId[position]);
        listImagesDessert.setImageResource(listDessertImages[position]);


        return convertView;
    }
}
