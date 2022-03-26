package com.example.visayatniti;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SharesRecyclerAdapter extends RecyclerView.Adapter<SharesRecyclerAdapter.MyViewHolder> {

    private Context context;

    SharesRecyclerAdapter(Context context){this.context = context;}

    @NonNull
    @Override
    public SharesRecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view= inflater.inflate(R.layout.cardview, parent, false);

        return new SharesRecyclerAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SharesRecyclerAdapter.MyViewHolder holder, int position) {

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
