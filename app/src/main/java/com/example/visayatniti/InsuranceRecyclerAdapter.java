package com.example.visayatniti;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class InsuranceRecyclerAdapter extends RecyclerView.Adapter<InsuranceRecyclerAdapter.MyViewHolder> {

    private Context context;
    private ArrayList InsuranceAgent, Company, SumAssured, Nominee;
    Integer Number;

    InsuranceRecyclerAdapter(Context context,Integer Number, ArrayList InsuranceAgent, ArrayList Company, ArrayList SumAssured, ArrayList Nominee)
    {
        this.context = context;
        this.InsuranceAgent = InsuranceAgent;
        this.Company = Company;
        this.SumAssured = SumAssured;
        this.Nominee = Nominee;
        this.Number = Number;
    }

    @NonNull
    @Override
    public InsuranceRecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view= inflater.inflate(R.layout.cardview_pink, parent, false);

        return new InsuranceRecyclerAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull InsuranceRecyclerAdapter.MyViewHolder holder, int position) {

        holder.agentName.setText("Insurance Agent "+String.valueOf(InsuranceAgent.get(position)));
        holder.company.setText("Company: " +String.valueOf(Company.get(position)));
        holder.sumAssured.setText("Sum Insured: Rs. "+String.valueOf(SumAssured.get(position)));
        holder.nominee.setText("Nominee : "+String.valueOf(Nominee.get(position)));

    }

    @Override
    public int getItemCount() {
        return Number;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView agentName, company, nominee, sumAssured;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            agentName = itemView.findViewById(R.id.accountNo);
            company = itemView.findViewById(R.id.details);
            sumAssured = itemView.findViewById(R.id.bal);
            nominee = itemView.findViewById(R.id.nominee);
        }
    }
}
