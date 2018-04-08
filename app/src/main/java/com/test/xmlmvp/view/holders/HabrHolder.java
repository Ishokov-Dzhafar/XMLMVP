package com.test.xmlmvp.view.holders;

import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

import com.test.xmlmvp.R;
import com.test.xmlmvp.model.response.Item;

/**
 * Created by dzhafar on 08.04.18.
 */

public class HabrHolder extends RecyclerView.ViewHolder {

    private WebView description;
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

    public void setData(Item item) {
        author.setText(item.getCreator());
        description.setVisibility(View.GONE);
        //If you want show description than uncomment this code
        /*description.getSettings().setJavaScriptEnabled(true);
        description.getSettings().setBuiltInZoomControls(true);
        description.setInitialScale(50);
        description.getSettings().setUseWideViewPort(true);
        description.loadData(item.getDescription(), "text/html", "UTF-8");*/

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
