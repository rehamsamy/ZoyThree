package com.zoythree.OrderActivity.Process;

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

public class OrderProcessFragment extends Fragment {

    RecyclerView recyclerView;
    OrderProcessAdapter adapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.order_process_fragment,container,false);
        recyclerView=view.findViewById(R.id.process_recycler_id);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter=new OrderProcessAdapter(getContext());
        recyclerView.setAdapter(adapter);
        return view;
    }


}
