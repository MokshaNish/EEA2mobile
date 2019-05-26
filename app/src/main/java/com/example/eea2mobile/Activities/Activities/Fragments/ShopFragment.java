package com.example.eea2mobile.Activities.Activities.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.example.eea2mobile.Activities.Activities.Acticities.ImageAdapter;
import com.example.eea2mobile.Activities.Activities.Acticities.navActivity;
import com.example.eea2mobile.Activities.Activities.Models.Product;
import com.example.eea2mobile.R;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class ShopFragment extends Fragment {

    String url = "http://10.0.3.2:8080/products";
    Product product;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //((navActivity) getActivity()).setActionBarTitle("Items");


//        if(Product.listAll(Product.class).size()<1) {
//            Type listType = new TypeToken<List<Product>>() {
//            }.getType();
//
//            List<Product> products = gson.fromJson(loadJSONFromAsset(getActivity()), listType);
//
//            SugarRecord.saveInTx(products);
//
//  }


        //    gridview.setAdapter(ia);




        LayoutInflater l = LayoutInflater.from(getContext());
        final View view = l.inflate(R.layout.fragment_shop, container, false);
        final GridView gridview = view.findViewById(R.id.gridview);

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

            }
        });

        RequestQueue requestQueue = Volley.newRequestQueue(getContext());

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {


                        Gson gson = new Gson();
                        List<Product> productList = gson.fromJson(response.toString(), new TypeToken<List<Product>>() {
                        }.getType());
                        ImageAdapter ia = new ImageAdapter(getActivity(), productList);

                        gridview.setAdapter(ia);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });


        requestQueue.add(jsonArrayRequest);


        //final EditText search = (EditText) view.findViewById(R.id.edittextsearch);
        //Button btnsearch = (Button) view.findViewById(R.id.searchbutton);


        return view;

    }
}


// getSupportActionBar().setTitle("Shop");





