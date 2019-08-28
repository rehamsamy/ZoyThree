package com.zoythree.OrderActivity.Process;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zoythree.R;
import com.zoythree.ShoppingCartAdapter;

public class OrderProcessAdapter extends RecyclerView.Adapter<OrderProcessAdapter.ViewHolder> {

    Context mContext;

    public OrderProcessAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(mContext).inflate(R.layout.process_fragment_list_item,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {

    }

    @Override
    public int getItemCount() {
        return 2;
    }


    public class ViewHolder  extends RecyclerView.ViewHolder{

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

}