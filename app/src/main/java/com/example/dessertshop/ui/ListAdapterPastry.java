package com.example.dessertshop.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dessertshop.R;

public class ListAdapterPastry extends BaseAdapter {

    Context context;
    String listPastryTitle[];
    int listPastryImages[];
    String listPastrysId[];
    LayoutInflater inflater;

    public ListAdapterPastry(Context context, String titlePastryList[], int pastryImages[], String pastryId[]){
        this.context = context;
        this.listPastryTitle = titlePastryList;
        this.listPastryImages = pastryImages;
        this.listPastrysId = pastryId;
       inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return listPastryTitle.length;
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
        convertView = inflater.inflate(R.layout.list_item_pastry, null);

        ImageView listImagePastry = (ImageView) convertView.findViewById(R.id.listImagePastry);
        TextView listTitlePastry = (TextView) convertView.findViewById(R.id.listTitlePastry);
        TextView listPastryId = (TextView) convertView.findViewById(R.id.listPastryId);

        listTitlePastry.setText(listPastryTitle[position]);
        listPastryId.setText(listPastrysId[position]);
        listImagePastry.setImageResource(listPastryImages[position]);

        return convertView;
    }
}
