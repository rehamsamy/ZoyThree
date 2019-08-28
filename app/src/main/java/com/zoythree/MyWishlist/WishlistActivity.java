package com.zoythree.MyWishlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.zoythree.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class WishlistActivity extends AppCompatActivity {

    @BindView(R.id.wishlist_recycler_id) RecyclerView recyclerView;
    WishlistAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wishlist);
        ButterKnife.bind(this);
        adapter=new WishlistAdapter(this);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setAdapter(adapter);
    }
}
