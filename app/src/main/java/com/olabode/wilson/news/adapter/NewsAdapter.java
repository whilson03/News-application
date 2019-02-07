package com.olabode.wilson.news.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.olabode.wilson.news.News;
import com.olabode.wilson.news.R;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<News> {
    private Context mContext;


    public NewsAdapter(Activity context, ArrayList<News> news) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        //  Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, news);
        this.mContext = context;


    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_items, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        News currentNews = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView description = (TextView) listItemView.findViewById(R.id.news_description);
        description.setText(currentNews.getDescription());

        // get url to image to load to the list view
        String url = currentNews.getImageUrl();
        // find the image in the list_item.xml layout view the view ID
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.news_image);
        // load images from url to the list item view
        Glide.with(mContext)
                .load(url)
                .centerCrop()
                .placeholder(R.drawable.no_image_placeholder)
                .into(imageView);

        TextView authorView = (TextView) listItemView.findViewById(R.id.news_author);
        if (currentNews.getAuthor().equals("null")) {
            authorView.setText("News.org");
        } else {
            authorView.setText(currentNews.getAuthor());
        }

        TextView titleView = (TextView) listItemView.findViewById(R.id.news_title);
        titleView.setText(currentNews.getTitle());

        // Return the list item view that is now sh

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
