package com.example.lenovo.laboratoriumpum3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Main2Activity extends AppCompatActivity {

    @BindView(R.id.Recyclerview)
RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);
        ArrayList<Place> miejsca = new ArrayList<>();
        miejsca.add(new Place(20,"Gliwice","Sląskie"));
        miejsca.add(new Place(15,"Kraków","Małopolskie"));
        miejsca.add(new Place(17,"Bielsko","Sląskie"));
        miejsca.add(new Place(10,"Zakopane","Małopolskie"));
        miejsca.add(new Place(21,"Gdańsk","Pomorskie"));

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recycler.setLayoutManager(layoutManager);

        PlaceAdapter placeAdapter = new PlaceAdapter(miejsca);
        recycler.setAdapter(placeAdapter);

    }
}
