package com.example.visayatniti;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class InsurancePage extends AppCompatActivity {

    RecyclerView recyclerView;
    InsuranceRecyclerAdapter adapter;
    AppCompatButton mAll, mDeposits, mSavings, mCurrent, mProvident;
    ArrayList<String> Nominee, InsuranceAgent, Company, sumAssured;
    TextView nums;
    ArrayList<Object> images;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insurance_page);
        
        initialize();

        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        nums = findViewById(R.id.num_of_nomi);
        mAll = findViewById(R.id.all);
        mDeposits = findViewById(R.id.lifeInsurance);
        mSavings = findViewById(R.id.healthInsurance);
        mCurrent = findViewById(R.id.endPlan);
        mProvident = findViewById(R.id.carInsurance);

        mAll.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.blue_btn));
        mAll.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.white));

        adapter = new InsuranceRecyclerAdapter(this, InsuranceAgent.size() ,InsuranceAgent, Company, sumAssured, Nominee,images);
        recyclerView.setAdapter(adapter);
        nums.setText(String.valueOf(InsuranceAgent.size()));

        mAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAll.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.blue_btn));
                mAll.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.white));

                mSavings.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.pink_box));
                mSavings.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.pink));

                mDeposits.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.pink_box));
                mDeposits.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.pink));

                mCurrent.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.pink_box));
                mCurrent.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.pink));

                mProvident.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.pink_box));
                mProvident.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.pink));

                adapter = new InsuranceRecyclerAdapter(getApplicationContext(), InsuranceAgent.size() ,InsuranceAgent, Company, sumAssured, Nominee,images);
                recyclerView.setAdapter(adapter);
                nums.setText(String.valueOf(InsuranceAgent.size()));
            }
        });

        mSavings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSavings.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.blue_btn));
                mSavings.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.white));

                mAll.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.pink_box));
                mAll.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.pink));

                mDeposits.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.pink_box));
                mDeposits.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.pink));

                mCurrent.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.pink_box));
                mCurrent.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.pink));

                mProvident.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.pink_box));
                mProvident.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.pink));

                adapter = new InsuranceRecyclerAdapter(getApplicationContext(), 2 ,InsuranceAgent, Company, sumAssured, Nominee,images);
                recyclerView.setAdapter(adapter);
                nums.setText("2");
            }
        });

        mDeposits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mDeposits.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.blue_btn));
                mDeposits.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.white));

                mSavings.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.pink_box));
                mSavings.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.pink));

                mAll.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.pink_box));
                mAll.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.pink));

                mCurrent.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.pink_box));
                mCurrent.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.pink));

                mProvident.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.pink_box));
                mProvident.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.pink));

                adapter = new InsuranceRecyclerAdapter(getApplicationContext(), 1 ,InsuranceAgent, Company, sumAssured, Nominee,images);
                recyclerView.setAdapter(adapter);
                nums.setText("1");
            }
        });

        mCurrent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCurrent.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.blue_btn));
                mCurrent.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.white));

                mSavings.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.pink_box));
                mSavings.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.pink));

                mDeposits.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.pink_box));
                mDeposits.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.pink));

                mAll.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.pink_box));
                mAll.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.pink));

                mProvident.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.pink_box));
                mProvident.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.pink));

                adapter = new InsuranceRecyclerAdapter(getApplicationContext(), 4 ,InsuranceAgent, Company, sumAssured, Nominee,images);
                recyclerView.setAdapter(adapter);
                nums.setText("4");
            }
        });

        mProvident.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mProvident.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.blue_btn));
                mProvident.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.white));

                mSavings.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.pink_box));
                mSavings.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.pink));

                mDeposits.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.pink_box));
                mDeposits.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.pink));

                mAll.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.pink_box));
                mAll.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.pink));

                mCurrent.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.pink_box));
                mCurrent.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.pink));

                adapter = new InsuranceRecyclerAdapter(getApplicationContext(), 3 ,InsuranceAgent, Company, sumAssured, Nominee,images);
                recyclerView.setAdapter(adapter);
                nums.setText("3");
            }
        });


    }

    private void initialize() {

        InsuranceAgent = new ArrayList<>();
        InsuranceAgent.add("Sudhakar Joshi, +91978654321");
        InsuranceAgent.add("Mayur Jain +91978653356");
        InsuranceAgent.add("Harsh Bajaj, +919481329412");
        InsuranceAgent.add("Ranjit Goyal, +919930724805");
        InsuranceAgent.add("Rachana Kapur, +917879592755");

        Company = new ArrayList<>();

        Company.add("Max Life Insurance");
        Company.add(" Birla Sun Life Insurance");
        Company.add("ICICI Prudential Life Ins.");
        Company.add("LIC (Life Insurance Corp.)");
        Company.add("Reliance Life Insurance");

        sumAssured = new ArrayList<>();
        sumAssured.add("1,20,00,000");
        sumAssured.add("2,00,50,000");
        sumAssured.add("30,00,000");
        sumAssured.add("3,15,00,000");
        sumAssured.add("1,20,00,000");

        Nominee = new ArrayList<>();
        Nominee.add("Devi Kaur");
        Nominee.add("Jaisingh Narut");
        Nominee.add("Jaspreet Dudhia");
        Nominee.add("Honey Kumar");
        Nominee.add("Sukhwinder Rai");

        images = new ArrayList<>();
        images.add(R.drawable.maxlife);
        images.add(R.drawable.birla);
        images.add(R.drawable.icic);
        images.add(R.drawable.lic);
        images.add(R.drawable.reliance);


    }
}