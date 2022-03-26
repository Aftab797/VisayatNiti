package com.example.visayatniti;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PropertyRecyclerAdapter extends RecyclerView.Adapter<PropertyRecyclerAdapter.MyViewHolder> {

    private Context context;

    PropertyRecyclerAdapter(Context context){this.context = context;}

    @NonNull
    @Override
    public PropertyRecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view= inflater.inflate(R.layout.cardview_pink, parent, false);

        return new PropertyRecyclerAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PropertyRecyclerAdapter.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 7;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

        }
    }
}
