package com.packages.joe.culinarian;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Joe on 2/4/2016.
 */
public class CustomFoodListAdapter extends BaseAdapter {
    ArrayList<FoodItem> listData;
    public LayoutInflater layoutInflater;
    public CustomFoodListAdapter(Context context, ArrayList<FoodItem> listData){
        this.listData = listData;
        layoutInflater = LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView == null){

        }
        return convertView;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }
    static class ViewHolder{
        TextView foodName;
        ImageView foodPic;
    }
}
