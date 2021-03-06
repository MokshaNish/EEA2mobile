package com.example.eea2mobile.Activities.Activities.Acticities;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.eea2mobile.Activities.Activities.Models.Product;
import com.example.eea2mobile.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ImageAdapter extends ArrayAdapter<Product> {

    private List<Product> listitem;
    Context context;


        Product p;

    public ImageAdapter(@NonNull Context context, @NonNull List<Product> listitem) {
            super(context, R.layout.activity_image_adapter, listitem);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {


            //("ViewHolder") View view= minflater.inflate(R.)

            p = getItem(position);
            LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            @SuppressLint("ViewHolder") View view = layoutInflater.inflate(R.layout.activity_image_adapter, parent, false);
            TextView textView = view.findViewById(R.id.tvShop);
            try {
                textView.setText(p.getName());
            } catch (Exception e) {
                e.printStackTrace();
            }


            ImageView imageView = view.findViewById(R.id.imageView2);
            //if (convertView == null) {
            // if it's not recycled, initialize some attributes
            //    imageView = new ImageView(mContext);
            //  imageView.setLayoutParams(new ViewGroup.LayoutParams(250, 250));
            //  imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            //  imageView.setPadding(8, 8, 8, 8);
            // } else {
            //   imageView = (ImageView) convertView;
            //}

            //imageView.setImageResource(mThumbIds[position]);
            try {
                Picasso.get()
                        .load(p.getImageUrl())
                        .placeholder(R.drawable.watch)
                        .resize(300, 300)
                        .into(imageView);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return view;


        }


        // references to our images
        //   private Integer[] mThumbIds = {

        //  };
    }
