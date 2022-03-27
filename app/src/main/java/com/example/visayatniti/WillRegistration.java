package com.example.visayatniti;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

public class WillRegistration extends AppCompatActivity {

    Button mButton;

    String[] items = {
            "Joint Sub-Registrar, Worli, AV764CD87",
            "Joint Sub-Registrar, Fort, AV76456M7",
            "Registrar, Palaghar, PB90788K",
            "Registrar, Raigad, RJ004C347",
            "Joint Sub-Registrar, Kurla, KP464KN89",
            "Registrar, Ratnagiri, RH432MK32",
            "Registrar, Pune, PN87W45T"
    };

    AutoCompleteTextView autoCompleteTextView;

    ArrayAdapter<String> adapterItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_will_registration);

        autoCompleteTextView = findViewById(R.id.filled_exposed_dropdown);

        adapterItems = new ArrayAdapter<String>(this, R.layout.list_item, items);
        autoCompleteTextView.setAdapter(adapterItems);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String item = adapterView.getItemAtPosition(position).toString();
            }
        });

        mButton = findViewById(R.id.register);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), WillSuccessful.class));
            }
        });

    }
}