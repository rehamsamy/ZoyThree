package com.zoythree.OrderActivity.Completed;

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

import com.zoythree.R;

public class OrderCompletedFragment extends Fragment  {

   OrderCompletedAdapter adapter;
   RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.order_completed_fragment,container,false);
        recyclerView=view.findViewById(R.id.completed_recycler_id);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter=new OrderCompletedAdapter(getContext());
        recyclerView.setAdapter(adapter);


        return view;
    }
}
