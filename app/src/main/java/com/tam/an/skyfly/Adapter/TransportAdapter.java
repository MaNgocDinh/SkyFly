package com.tam.an.skyfly.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tam.an.skyfly.model.TransportCategories;
import com.tam.an.skyfly.R;

import java.util.ArrayList;

public class TransportAdapter extends RecyclerView.Adapter<TransportAdapter.ViewHolder> {
    Context mContext;
    ArrayList<TransportCategories>mList;

    public TransportAdapter(Context context, ArrayList<TransportCategories> list) {
        mContext = context;
        mList = list;
    }

    @NonNull
    @Override
    public TransportAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_transport_catrgories,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TransportCategories categories=mList.get(position);
        holder.text.setText(categories.getTransport());
    }

    @Override
    public int getItemCount() {
        return mList !=null? mList.size():null;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView text;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            text=itemView.findViewById(R.id.transport);
        }
    }
}
