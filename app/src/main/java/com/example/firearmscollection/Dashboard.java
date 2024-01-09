package com.example.firearmscollection;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class Dashboard extends AppCompatActivity {
    RelativeLayout btnadd,btnview;
    DatabaseHelper DB;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btnadd = (RelativeLayout)findViewById(R.id.badd);
        btnview =(RelativeLayout)findViewById(R.id.vall);

        Toast.makeText(Dashboard.this,"Login Successfully",Toast.LENGTH_LONG).show();

        DB = new DatabaseHelper(this);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openReservation(); }
        });

        btnview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openCustomerData(); }
        });

    }

    public void openReservation (){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openCustomerData (){
        Intent intent = new Intent(this, CollectionList.class);
        startActivity(intent);
    }

}