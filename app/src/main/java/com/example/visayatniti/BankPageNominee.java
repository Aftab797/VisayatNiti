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

public class BankPageNominee extends AppCompatActivity {

    RecyclerView recyclerView;
    BankNomineeRecyclerAdapter adapter;
    AppCompatButton mAll, mDeposits, mSavings, mCurrent, mProvident;
    ArrayList<String> Nominee, AccountNo, Bank, Branch,Balance;
    TextView nums;
    ArrayList<Object> images;

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
        adapter = new BankNomineeRecyclerAdapter(this, AccountNo.size() ,AccountNo, Bank, Branch, Nominee, images);
        recyclerView.setAdapter(adapter);
        nums.setText(String.valueOf(AccountNo.size()));


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

                adapter = new BankNomineeRecyclerAdapter(getApplicationContext(), AccountNo.size() ,AccountNo, Bank, Branch, Nominee, images);
                recyclerView.setAdapter(adapter);
                nums.setText(String.valueOf(AccountNo.size()));
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

                adapter = new BankNomineeRecyclerAdapter(getApplicationContext(), 4 ,AccountNo, Bank, Branch, Nominee, images);
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

                adapter = new BankNomineeRecyclerAdapter(getApplicationContext(), 5 ,AccountNo, Bank, Branch, Nominee, images);
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

                adapter = new BankNomineeRecyclerAdapter(getApplicationContext(), 2 ,AccountNo, Bank, Branch, Nominee, images);
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

                adapter = new BankNomineeRecyclerAdapter(getApplicationContext(), 6 ,AccountNo, Bank, Branch, Nominee, images);
                recyclerView.setAdapter(adapter);
                nums.setText("6");
            }
        });

    }

    private void initializeArrays() {

        Nominee = new ArrayList<>();
        Nominee.add("Puneet Singh");
        Nominee.add("Yash Yadav");
        Nominee.add("Neha Kaur");
        Nominee.add("Pooja Singh");
        Nominee.add("Ravi Singh");
        Nominee.add("Devi Kaur");
        Nominee.add("Jaisingh Narut");
        Nominee.add("Jaspreet Dudhia");
        Nominee.add("Honey Kumar");
        Nominee.add("Sukhwinder Rai");

        AccountNo = new ArrayList<>();
        AccountNo.add("1365100987561");
        AccountNo.add("5421098467757");
        AccountNo.add("6531625336510");
        AccountNo.add("9520901665093");
        AccountNo.add("4050690057210");
        AccountNo.add("8533939469828");
        AccountNo.add("1260385675781");
        AccountNo.add("3088068312329");
        AccountNo.add("3385311289976");
        AccountNo.add("1365100987561");

        Bank = new ArrayList<>();
        Bank.add("Axis Bank");
        Bank.add("HDFC Bank");
        Bank.add("Punjab National Bank");
        Bank.add("ICICI Bank");
        Bank.add("IDFC First Bank");
        Bank.add("IDBI Bank");
        Bank.add("State Bank of India");
        Bank.add("Bank of Maharashtra");
        Bank.add("Bank of Baroda");
        Bank.add("Kotak Mahindra Bank");

        Branch = new ArrayList<>();
        Branch.add("Seawoods");
        Branch.add("Nerul");
        Branch.add("Kharghar");
        Branch.add("Juinagar");
        Branch.add("Seawoods");
        Branch.add("Nerul");
        Branch.add("Kharghar");
        Branch.add("Juinagar");
        Branch.add("Kharghar");
        Branch.add("Juinagar");

        images = new ArrayList<>();
        images.add(R.drawable.axis);
        images.add(R.drawable.hdfc);
        images.add(R.drawable.pnb);
        images.add(R.drawable.icic);
        images.add(R.drawable.maharashtra);
        images.add(R.drawable.idbi);
        images.add(R.drawable.hdfc);
        images.add(R.drawable.maharashtra);
        images.add(R.drawable.bob);
        images.add(R.drawable.kotak);

    }
}