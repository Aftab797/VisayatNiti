package com.example.visayatniti;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BankRecyclerAdapter extends RecyclerView.Adapter<BankRecyclerAdapter.MyViewHolder> {

    private Context context;
    private ArrayList Account, Bank, Branch, Nominee, images;
    Integer Number;

    BankRecyclerAdapter(Context context,Integer Number, ArrayList Account, ArrayList Bank, ArrayList Branch, ArrayList Nominee, ArrayList images){
        this.context = context;
        this.Account = Account;
        this.Bank = Bank;
        this.Branch = Branch;
        this.Nominee = Nominee;
        this.Number = Number;
    this.images = images;}

    @NonNull
    @Override
    public BankRecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view= inflater.inflate(R.layout.cardview, parent, false);

        return new BankRecyclerAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BankRecyclerAdapter.MyViewHolder holder, int position) {

        holder.accountNo.setText("A/C : "+String.valueOf(Account.get(position)));
        holder.bank.setText("BANK : " +String.valueOf(Bank.get(position))+"\nBRANCH : "+String.valueOf(Branch.get(position)));
        holder.nominee.setText("Nominee : "+String.valueOf(Nominee.get(position)));
        holder.imgView.setImageDrawable(ContextCompat.getDrawable(context, (Integer) images.get(position)));
    }

    @Override
    public int getItemCount() {
        return Number;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView accountNo, bank, nominee;
        ImageView imgView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            accountNo = itemView.findViewById(R.id.accountNo);
            bank = itemView.findViewById(R.id.details);
            nominee = itemView.findViewById(R.id.nominee);
            imgView = itemView.findViewById(R.id.img);
        }
    }
}
