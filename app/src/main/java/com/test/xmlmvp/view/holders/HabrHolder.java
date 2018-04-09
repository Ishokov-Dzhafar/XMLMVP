package com.test.xmlmvp.view.holders;

import android.annotation.SuppressLint;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

import com.test.xmlmvp.R;
import com.test.xmlmvp.model.response.Item;

/**
 * Created by dzhafar on 08.04.18.
 */

public class HabrHolder extends RecyclerView.ViewHolder {

    private TextView description;
    private TextView author;
    private TextView title;
    private TextView date;
    private TextView tags;

    public HabrHolder(View itemView) {
        super(itemView);
        description = itemView.findViewById(R.id.description);
        author = itemView.findViewById(R.id.author);
        title = itemView.findViewById(R.id.title);
        date = itemView.findViewById(R.id.date);
        tags = itemView.findViewById(R.id.tags);
    }

    @SuppressLint("SetJavaScriptEnabled")
    public void setData(Item item) {
        author.setText(item.getCreator());
        description.setText(Html.fromHtml(item.getDescription()));
        title.setText(item.getTitle());
        date.setText(item.getPubDate());
        StringBuilder stringTags = new StringBuilder();
        for (String tag: item.getCategoryes()) {
            stringTags.append(tag).append(", ");
        }
        stringTags.delete(stringTags.length()-2, stringTags.length()); //delete last ", "
        tags.setText(stringTags.toString().trim());
    }
}
