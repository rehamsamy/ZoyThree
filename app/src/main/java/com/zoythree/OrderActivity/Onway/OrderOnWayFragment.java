package com.zoythree.OrderActivity.Onway;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zoythree.OrderActivity.Completed.OrderCompletedAdapter;
import com.zoythree.R;

public class OrderOnWayFragment extends Fragment {
    Context mContext;
    OrderOnwayAdapter adapter;
    RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=LayoutInflater.from(getContext()).inflate(R.layout.order_onway_fragment,container,false);
        recyclerView=view.findViewById(R.id.onway_recycler_id);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter=new OrderOnwayAdapter(getContext());
        recyclerView.setAdapter(adapter);
        return view;
    }
}
