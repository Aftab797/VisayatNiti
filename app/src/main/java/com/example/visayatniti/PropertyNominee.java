package com.example.visayatniti;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PropertyNominee extends AppCompatActivity {

    RecyclerView recyclerView;
    PropertyNomineeRecyclerAdapter adapter;
    AppCompatButton mAll, mDeposits, mSavings, mCurrent, mProvident;
    ArrayList<String> Nominee, Company, CurrentPrice, Invested;
    ArrayList<Object> images;
    TextView nums;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_page_nominee);

        initializeArrays();

        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        nums = findViewById(R.id.num_of_nomi);
        mAll = findViewById(R.id.all);
        mDeposits = findViewById(R.id.deposit);
        mSavings = findViewById(R.id.accounts);
        mCurrent = findViewById(R.id.currentAccount);
        mProvident = findViewById(R.id.providentFunds);

        mAll.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.pink_btn));
        mAll.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.white));
        adapter = new PropertyNomineeRecyclerAdapter(this, Company.size() ,Company, CurrentPrice, Invested, Nominee, images);
        recyclerView.setAdapter(adapter);
        nums.setText(String.valueOf(Company.size()));


        mAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAll.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.pink_btn));
                mAll.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.white));

                mSavings.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.pink_box));
                mSavings.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.pink));

                mDeposits.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.pink_box));
                mDeposits.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.pink));

                mCurrent.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.pink_box));
                mCurrent.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.pink));

                mProvident.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.pink_box));
                mProvident.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.pink));

                adapter = new PropertyNomineeRecyclerAdapter(getApplicationContext(),  Company.size() ,Company, CurrentPrice, Invested, Nominee,images);
                recyclerView.setAdapter(adapter);
                nums.setText(String.valueOf(Company.size()));
            }
        });

        mSavings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSavings.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.pink_btn));
                mSavings.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.white));

                mAll.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.pink_box));
                mAll.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.pink));

                mDeposits.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.pink_box));
                mDeposits.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.pink));

                mCurrent.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.pink_box));
                mCurrent.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.pink));

                mProvident.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.pink_box));
                mProvident.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.pink));

                adapter = new PropertyNomineeRecyclerAdapter(getApplicationContext(), 4 ,Company, CurrentPrice, Invested, Nominee, images);
                recyclerView.setAdapter(adapter);
                nums.setText("4");
            }
        });

        mDeposits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mDeposits.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.pink_btn));
                mDeposits.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.white));

                mSavings.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.pink_box));
                mSavings.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.pink));

                mAll.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.pink_box));
                mAll.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.pink));

                mCurrent.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.pink_box));
                mCurrent.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.pink));

                mProvident.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.pink_box));
                mProvident.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.pink));

                adapter = new PropertyNomineeRecyclerAdapter(getApplicationContext(), 5 ,Company, CurrentPrice, Invested, Nominee,images);
                recyclerView.setAdapter(adapter);
                nums.setText("5");
            }
        });

        mCurrent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCurrent.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.pink_btn));
                mCurrent.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.white));

                mSavings.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.pink_box));
                mSavings.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.pink));

                mDeposits.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.pink_box));
                mDeposits.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.pink));

                mAll.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.pink_box));
                mAll.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.pink));

                mProvident.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.pink_box));
                mProvident.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.pink));

                adapter = new PropertyNomineeRecyclerAdapter(getApplicationContext(), 2 ,Company, CurrentPrice, Invested, Nominee,images);
                recyclerView.setAdapter(adapter);
                nums.setText("2");
            }
        });

        mProvident.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mProvident.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.pink_btn));
                mProvident.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.white));

                mSavings.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.pink_box));
                mSavings.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.pink));

                mDeposits.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.pink_box));
                mDeposits.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.pink));

                mAll.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.pink_box));
                mAll.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.pink));

                mCurrent.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.pink_box));
                mCurrent.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.pink));

                adapter = new PropertyNomineeRecyclerAdapter(getApplicationContext(), 6 ,Company, CurrentPrice, Invested, Nominee,images);
                recyclerView.setAdapter(adapter);
                nums.setText("6");
            }
        });

    }

    private void initializeArrays() {

        Nominee = new ArrayList<>();

        Nominee.add("Pooja Singh");
        Nominee.add("Ravi Singh");
        Nominee.add("Devi Kaur");
        Nominee.add("Jaisingh Narut");
        Nominee.add("Jaspreet Dudhia");
        Nominee.add("Honey Kumar");
        Nominee.add("Sukhwinder Rai");

        Company = new ArrayList<>();
        Company.add("Crompton Greaves");
        Company.add("Adani Port");
        Company.add("PayTM");
        Company.add("ONGC");
        Company.add("Gillette");
        Company.add("Pfizer");
        Company.add("Britannia");

        CurrentPrice = new ArrayList<>();
        CurrentPrice.add("100.08");
        CurrentPrice.add("3096.78");
        CurrentPrice.add("234.76");
        CurrentPrice.add("7013.80");
        CurrentPrice.add("300.45");
        CurrentPrice.add("23.5");
        CurrentPrice.add("300.45");

        Invested = new ArrayList<>();
        Invested.add("1,20,000");
        Invested.add("50,0000");
        Invested.add("2,45,000");
        Invested.add("20,16,350");
        Invested.add("75,000");
        Invested.add("1,00,000");
        Invested.add("10,12,000");

        images = new ArrayList<>();
        images.add(R.drawable.crompton);
        images.add(R.drawable.adani);
        images.add(R.drawable.paytm);
        images.add(R.drawable.ongc);
        images.add(R.drawable.gillete);
        images.add(R.drawable.pfizer);
        images.add(R.drawable.britania);


    }
}