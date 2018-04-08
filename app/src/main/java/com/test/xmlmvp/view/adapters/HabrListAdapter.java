package com.test.xmlmvp.view.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.test.xmlmvp.R;
import com.test.xmlmvp.model.response.Item;
import com.test.xmlmvp.view.holders.HabrHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dzhafar on 08.04.18.
 */

public class HabrListAdapter extends RecyclerView.Adapter<HabrHolder> {

    private List<Item> data;

    public HabrListAdapter () {
        data = new ArrayList<>();
    }

    @Override
    public HabrHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.habr_item, parent, false);
        return new HabrHolder(view);
    }

    @Override
    public void onBindViewHolder(HabrHolder holder, int position) {
        holder.setData(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public void setData(List<Item> result) {
        data.clear();
        data.addAll(result);
        notifyDataSetChanged();
    }

}
