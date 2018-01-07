package com.example.lenovo.laboratoriumpum3;

import android.content.Intent;
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
    String cityText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);

        final ArrayList<Place> miejsca = new ArrayList<>();
        miejsca.add(new Place(20,"Gliwice","Sląskie"));
        miejsca.add(new Place(15,"Kraków","Małopolskie"));
        miejsca.add(new Place(17,"Bielsko","Sląskie"));
        miejsca.add(new Place(10,"Zakopane","Małopolskie"));
        miejsca.add(new Place(21,"Gdańsk","Pomorskie"));

        OnClickPlace listener = (view, position) -> {

            cityText = miejsca.get(position).getPleaceName();
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("CityName", cityText);
            intent.putExtras(bundle);
            startActivity(intent);
        };
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recycler.setLayoutManager(layoutManager);

        PlaceAdapter placeAdapter = new PlaceAdapter(miejsca,listener);
        recycler.setAdapter(placeAdapter);

    }
}
